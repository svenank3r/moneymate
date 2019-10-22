package com.srgms.moneymate.api.transactions;

import com.srgms.moneymate.model.currency.Currency;
import com.srgms.moneymate.model.transaction.Transaction;
import com.srgms.moneymate.model.transaction.TransactionBuilder;
import com.srgms.moneymate.model.transaction.TransactionCsvObject;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
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

            BeanListProcessor<TransactionCsvObject> rowProcessor = new BeanListProcessor<>(TransactionCsvObject.class);
            CsvParserSettings parserSettings = new CsvParserSettings();
            parserSettings.getFormat().setLineSeparator("\n");
            parserSettings.setProcessor(rowProcessor);
            parserSettings.setHeaderExtractionEnabled(true);
            CsvParser csvParser = new CsvParser(parserSettings);

            csvParser.parse(inputStream);

            List<TransactionCsvObject> csvObjects = rowProcessor.getBeans();

            for (TransactionCsvObject csvObject: csvObjects) {
                transactions.add(
                    new Transaction(
                        null,
                        csvObject.getTransactionDate(),
                        csvObject.getAccountNumber(),
                        csvObject.getCurrency().equals(Currency.EUR.getCode()) ? Currency.EUR : null,
                        csvLineParts[3].equals("C") ? true : false,
                        Double.valueOf(csvLineParts[4]),
                        csvLineParts[6],
                        csvLineParts[5],
                        csvLineParts[10]
                    )
                );
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
