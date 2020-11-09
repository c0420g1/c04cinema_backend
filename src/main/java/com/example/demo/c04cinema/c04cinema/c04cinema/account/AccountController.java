package com.example.demo.c04cinema.c04cinema.c04cinema.account;


import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.role.Role;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccount;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccountImpl;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccountManager;
import com.example.demo.c04cinema.model_dto.AccountFb;
import com.example.demo.c04cinema.model_dto.JwtDTO;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuple3;
import com.speedment.common.tuple.Tuples;
import com.speedment.runtime.join.Join;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.GeneratedAccountController;
import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.TokenAuthenticator;
import com.example.demo.c04cinema.model_dto.AccountDTO;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
@RestController
public class AccountController extends GeneratedAccountController {
    @Autowired
    private AccountManager accountManager;
    @Autowired
    private CustomerManager customerManager;
    @Autowired
    private JoinComponent joinComponent;
    @Autowired
    private RoleAccountManager roleAccountManager;

    @GetMapping("/accountIdFirst")
    public Account getAllAccount(){
        return accountManager.stream().sorted(Account.ID.reversed()).findFirst().get();
    }

    @GetMapping("/customerIdFirst")
    public Customer getAllCustomer(){
        return customerManager.stream().sorted(Customer.ID.reversed()).findFirst().get();
    }

    @PostMapping("/checkAccount")
    public Account checkAccount(@RequestBody AccountDTO accountDTO){
        Account account = null;
        try {
             account = accountManager.stream().filter(Account.USERNAME.equal(accountDTO.getUsername())).findFirst().get();
        }catch (Exception e){
            e.getMessage();
        }
        if(account != null){
            return account;
        }
        return null;
    }
    @PostMapping("/checkEmail")
    public Customer checkEmail(@RequestBody String email){
        System.out.println(email);
        Customer customer1 = null;
        try {
            customer1 = customerManager.stream().filter(Customer.EMAIL.equal(email)).findFirst().get();
        }catch (Exception e){
            e.getMessage();
        }
        if (customer1 !=null){
            return customer1;
        }
        return null;
    }

    @PostMapping("/login")
    public JwtDTO getJwt(@RequestBody AccountDTO accountDTO, HttpServletResponse response){
        System.out.println(accountDTO);
        Account account = accountManager.stream().filter(Account.USERNAME.equal(accountDTO.getUsername())).findFirst().get();
        System.out.println(account);
        if(new BCryptPasswordEncoder().matches( accountDTO.getPassword(), account.getPassword().get()) && account!=null) {
            Join<Tuple3<Account, RoleAccount, Role>> join = joinComponent.from(AccountManager.IDENTIFIER).where(Account.ID.equal(account.getId())).innerJoinOn(RoleAccount.ACCOUNT_ID).equal(Account.ID)
                    .innerJoinOn(Role.ID).equal(RoleAccount.ROLE_ID).build(Tuples::of);
            String roleName =join.stream().findFirst().get().get2().getName().get();
            String token = TokenAuthenticator.addAuthentication( accountDTO.getUsername(),roleName);
            Customer customer = customerManager.stream().filter(Customer.ACCOUNT_ID.equal(account.getId())).findFirst().get();
            return new JwtDTO(token,account.getUsername().get(),roleName,account.getId(),customer.getImageUrl().get());
        }
        return null;
    }

    @PostMapping("/loginFb")
    public JwtDTO getAccFb(@RequestBody AccountFb accountFb){
        String randomNumber = "123456789";
        String result = "KH-";
        for (int i = 0; i < 5; i++) {
            result += randomNumber.charAt((int) Math.floor(Math.random()*randomNumber.length()));
        }
        Account account = null;
        Customer customer1 = null;
        try {
             account = accountManager.stream().filter(Account.USERNAME.equal(accountFb.getName())).findFirst().get();
        }catch (Exception e){
            e.getMessage();
        }
        if (account == null){
            Account account1 = new AccountImpl();
            account1.setUsername(accountFb.getName());
            accountManager.persist(account1);
            account = accountManager.stream().filter(Account.USERNAME.equal(accountFb.getName())).findFirst().get();
            System.out.println(account.getId());
            Customer customer = new CustomerImpl();
            customer.setName(accountFb.getName());
            customer.setEmail(accountFb.getEmail());
            customer.setAccountId(account.getId());
            customer.setCustomerTypeId(1);
            customer.setCurrentBonusPoint(0);
            customer.setCode(result);
            customer.setIsactive((byte) 1);
            customer.setImageUrl("https://www.fit2work.com.au/assets/img/avatars/LoginIconAppl.png");
            customerManager.persist(customer);
            RoleAccount roleAccount = new RoleAccountImpl();
            roleAccount.setAccountId(account.getId());
            roleAccount.setRoleId(1);
            roleAccountManager.persist(roleAccount);
            String token = TokenAuthenticator.addAuthentication(accountFb.getName(),"customer");
            customer1 = customerManager.stream().filter(Customer.ACCOUNT_ID.equal(account.getId())).findFirst().get();
            return new JwtDTO(token,account.getUsername().get(),"customer",account.getId(),customer1.getImageUrl().get());
        }
        customer1 = customerManager.stream().filter(Customer.ACCOUNT_ID.equal(account.getId())).findFirst().get();
        String token = TokenAuthenticator.addAuthentication(accountFb.getName(),"customer");
        return new JwtDTO(token,account.getUsername().get(),"customer",account.getId(),customer1.getImageUrl().get());
    }
}
