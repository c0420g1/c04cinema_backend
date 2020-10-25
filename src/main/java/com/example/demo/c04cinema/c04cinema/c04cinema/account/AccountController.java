package com.example.demo.c04cinema.c04cinema.c04cinema.account;

import com.example.demo.c04cinema.c04cinema.c04cinema.account.generated.GeneratedAccountController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AccountController extends GeneratedAccountController {
    @Autowired
    private AccountManager accountManager;

    @GetMapping("/accountIdFirst")
    public Account getAllAccount(){
        return accountManager.stream().sorted(Account.ID.reversed()).findFirst().get();
    }
}
