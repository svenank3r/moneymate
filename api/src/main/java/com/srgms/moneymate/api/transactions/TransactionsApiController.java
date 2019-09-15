package com.srgms.moneymate.api.transactions;

import com.srgms.moneymate.model.transaction.Transaction;
import com.srgms.moneymate.model.transaction.TransactionBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionsApiController {

    @RequestMapping(path = "/transactions", method = RequestMethod.GET)
    public List<Transaction> getTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new TransactionBuilder().aTransaction().build());
        transactions.add(new TransactionBuilder().aTransaction().build());
        transactions.add(new TransactionBuilder().aTransaction().build());
        transactions.add(new TransactionBuilder().aTransaction().build());
        transactions.add(new TransactionBuilder().aTransaction().build());
        transactions.add(new TransactionBuilder().aTransaction().build());

        return transactions;
    }
}
