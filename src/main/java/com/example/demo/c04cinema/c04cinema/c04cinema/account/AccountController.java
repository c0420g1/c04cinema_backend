package com.example.demo.c04cinema.c04cinema.c04cinema.account;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.GeneratedAccountController;
import com.example.demo.c04cinema.model_dto.AccountDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AccountController extends GeneratedAccountController {
    @PostMapping("/login")
    public String huy(@RequestBody AccountDTO accountDTO, HttpServletResponse response){
       return TokenAuthenticator.addAuthentication(response,"aaa","admin");
    }
}
