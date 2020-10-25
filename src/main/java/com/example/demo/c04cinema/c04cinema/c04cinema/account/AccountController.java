package com.example.demo.c04cinema.c04cinema.c04cinema.account;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.GeneratedAccountController;
import com.example.demo.c04cinema.model_dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController extends GeneratedAccountController {
    @Autowired
    AccountManager accountManager;

    @PostMapping("/login")
    public String huy(@RequestBody AccountDTO accountDTO, HttpServletResponse response){
        Account account = accountManager.stream().filter(Account.USERNAME.equal(accountDTO.getUsername())).findFirst().get();

//        BCryptPasswordEncoder b= new BCryptPasswordEncoder();
        if(new BCryptPasswordEncoder().matches(accountDTO.getPassword(), account.getPassword().get()) && account!=null)
            return TokenAuthenticator.addAuthentication(response,accountDTO.getId(),accountDTO.getUsername() ,"admin");

       return"tài khoản hoặc mật khẩu không chính xác";
    }
}
