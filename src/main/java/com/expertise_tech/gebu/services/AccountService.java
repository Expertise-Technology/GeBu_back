package com.expertise_tech.gebu.services;

import com.expertise_tech.gebu.entites.Account;
import com.expertise_tech.gebu.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
    
    public Account getAccountByCenter(Long id) {
    	return accountRepository.findByCenter(id);
    }
}
