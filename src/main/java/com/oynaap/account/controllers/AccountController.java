package com.oynaap.account.controllers;

import com.oynaap.account.models.AccountEntity;
import com.oynaap.account.services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value={"/login","/"})
    public String  loginView(){
        return "login";
    }

    @GetMapping("/register")
    public String  registerView(Model model){
        model.addAttribute("user",new AccountEntity());
        return "createAccount";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String createAccount(@ModelAttribute AccountEntity accountEntity, Model model){
       System.out.println(accountEntity.toString());
        accountService.createAccount(accountEntity);
        model.addAttribute("regSucc","you have been registred successfully");
        return "login";
    }

}
