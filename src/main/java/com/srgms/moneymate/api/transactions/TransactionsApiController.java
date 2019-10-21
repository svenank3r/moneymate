package com.srgms.moneymate.api.transactions;

import com.srgms.moneymate.model.currency.Currency;
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

        try(
            InputStream inputStream = file.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))
        ) {
            Set<Transaction> transactions = new HashSet<>();

            String line;
            while ((line = br.readLine()) != null) {
                String[] csvLineParts = line.split(",");

                Transaction newTransaction = new Transaction(
                    null,
                    LocalDateTime.parse(csvLineParts[2]),
                    csvLineParts[0],
                    csvLineParts[1].equals(Currency.EUR.getCode()) ? Currency.EUR : null,
                    csvLineParts[3].equals("C") ? true : false,
                    Double.valueOf(csvLineParts[4]),
                    csvLineParts[6],
                    csvLineParts[5],
                    csvLineParts[10]
                );

                transactions.add(newTransaction);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/uploadMultiple")
    public void importMultipleTransactionsFiles(@RequestParam("files") MultipartFile[] files) {
        for(MultipartFile file : files) {
            LOGGER.debug("Got file with name {}", file.getOriginalFilename());
        }
    }
}
