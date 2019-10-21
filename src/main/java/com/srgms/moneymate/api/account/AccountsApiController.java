package com.srgms.moneymate.api.account;

import com.srgms.moneymate.model.account.Account;
import com.srgms.moneymate.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/accounts")
public class AccountsApiController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Account> getAll() {
        List<Account> accounts = accountService.getAllAccounts();

        return accounts;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public Account getById(@PathVariable("id") long id) {
        Account account = accountService.getAccountById(id);

        return account;
    }
}
