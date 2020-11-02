package com.example.demo.c04cinema.c04cinema.c04cinema.account;


import com.example.demo.c04cinema.c04cinema.c04cinema.customer.Customer;
import com.example.demo.c04cinema.c04cinema.c04cinema.customer.CustomerManager;
import com.example.demo.c04cinema.c04cinema.c04cinema.role.Role;
import com.example.demo.c04cinema.c04cinema.c04cinema.role_account.RoleAccount;
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
            return new JwtDTO(token,account.getUsername().get(),roleName,account.getId());
        }
        return null;
    }
}
