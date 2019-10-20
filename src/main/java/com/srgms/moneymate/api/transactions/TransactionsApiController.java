package com.srgms.moneymate.api.transactions;

import com.srgms.moneymate.model.transaction.Transaction;
import com.srgms.moneymate.model.transaction.TransactionBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/transactions")
public class TransactionsApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionsApiController.class);

    @RequestMapping(method = RequestMethod.GET)
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

    @RequestMapping(method = RequestMethod.POST, path = "/upload")
    public ResponseEntity importTransactionsFile(@RequestParam("file") MultipartFile file) {
        LOGGER.debug("Got file with name {}", file.getOriginalFilename());

        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/uploadMultiple")
    public void importMultipleTransactionsFiles(@RequestParam("files") MultipartFile[] files) {
        for(MultipartFile file : files) {
            LOGGER.debug("Got file with name {}", file.getOriginalFilename());
        }
    }
}
