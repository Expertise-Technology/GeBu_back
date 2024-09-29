package com.expertise_tech.gebu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.expertise_tech.gebu.entites.Account;
import com.expertise_tech.gebu.services.AccountService;

@RestController
@RequestMapping("/api/account")
@CrossOrigin(origins = "*")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return new ResponseEntity<>(accountService.saveAccount(account), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }
    
    @GetMapping(value = "/{id}")
    public Account getAccountByCenter(@PathVariable("id") Long id) {
    	return accountService.getAccountByCenter(id);
    }
}
