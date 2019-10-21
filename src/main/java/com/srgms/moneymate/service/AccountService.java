package com.srgms.moneymate.service;

import com.srgms.moneymate.dao.account.AccountRepository;
import com.srgms.moneymate.model.account.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(account -> accounts.add(account));
        return accounts;
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).get();
    }
}
