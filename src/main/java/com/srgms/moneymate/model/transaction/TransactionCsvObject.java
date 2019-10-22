package com.srgms.moneymate.model.transaction;

import com.srgms.moneymate.model.util.LocalDateConverter;
import com.univocity.parsers.annotations.Convert;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Validate;

import java.time.LocalDate;

public final class TransactionCsvObject {

    //IBAN/BBAN,"Munt","BIC","Volgnr","Datum","Rentedatum","Bedrag","Saldo na trn","Tegenrekening IBAN/BBAN","Naam tegenpartij","Naam uiteindelijke partij","Naam initiërende partij","BIC tegenpartij","Code","Batch

    @Validate
    @Parsed(field = "Munt")
    //TODO: Write converter for Currency
    private String currency;

    @Validate
    @Parsed(field = "IBAN/BBAN")
    private String accountNumber;

    @Validate
    @Convert(conversionClass = LocalDateConverter.class, args = "yyyy-MM-dd")
    @Parsed(field = "Datum")
    private LocalDate transactionDate;

    @Validate
    @Parsed(field = "Bedrag")
    private Double amount;

    public String getCurrency() {
        return currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public Double getAmount() {
        return amount;
    }
}
