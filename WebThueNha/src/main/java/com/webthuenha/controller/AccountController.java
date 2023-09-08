package com.webthuenha.controller;

import com.webthuenha.model.Account;
import com.webthuenha.service.iService.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accountList = accountService.getAll();
        if (accountList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(accountList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        if(!checkAccount(account)) {
            return null;
        }
        return new ResponseEntity<>(accountService.save(account), HttpStatus.CREATED);
    }

    @GetMapping("/edit/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id) {
        Account currentAccount = accountService.findById(id);
        if (currentAccount == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(currentAccount, HttpStatus.OK);
    }

    @PostMapping("/edit/{id}")
    public ResponseEntity<Account> editAccount(@RequestBody Account account, @PathVariable int id) {
        Account currentAccount = accountService.findById(id);
        if (currentAccount == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        currentAccount.setUsername(account.getUsername());
        currentAccount.setPassword(account.getPassword());
        currentAccount.setRole(account.getRole());

        return new ResponseEntity<>(accountService.edit(currentAccount), HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable int id) {
        if (accountService.findById(id) == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        accountService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/checkAccount")
    public boolean checkAccount (@RequestBody Account account) {
        if(accountService.checkAccountUsername(account.getUsername())!=0) {
            return false;
        }else {
            return true;
        }
    }
}
