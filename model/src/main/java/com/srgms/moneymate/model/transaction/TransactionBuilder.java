package com.srgms.moneymate.model.transaction;

import com.srgms.moneymate.model.currency.Currency;

import java.time.LocalDateTime;

public class TransactionBuilder {

    private Long transactionId;
    private LocalDateTime transactionDate;
    private String accountNumber;
    private Currency currency;
    private boolean credit; // False if debit
    private Double amount;
    private String counterAccountName;
    private String counterAccountNumber;
    private String description;

    public TransactionBuilder aTransaction() {
        return new TransactionBuilder()
            .withTransactionId(1L)
            .withTransactionDate(LocalDateTime.now())
            .withAccountNumber("NL72RABO0102453942")
            .withCurrency(Currency.EUR)
            .withIsCredit(true)
            .withAmount(234.21)
            .withCounterAccountName("S. Anker")
            .withCounterAccountNumber("NL72RABO0102453942")
            .withDescription("This is a transaction");
    }

    public TransactionBuilder withTransactionId(Long value) {
        this.transactionId = value;
        return this;
    }

    public TransactionBuilder withTransactionDate(LocalDateTime value) {
        this.transactionDate = value;
        return this;
    }

    public TransactionBuilder withAccountNumber(String value) {
        this.accountNumber = value;
        return this;
    }

    public TransactionBuilder withCurrency(Currency value) {
        this.currency = value;
        return this;
    }

    public TransactionBuilder withIsCredit(boolean value) {
        this.credit = value;
        return this;
    }

    public TransactionBuilder withAmount(Double value) {
        this.amount = value;
        return this;
    }

    public TransactionBuilder withCounterAccountName(String value) {
        this.counterAccountName = value;
        return this;
    }

    public TransactionBuilder withCounterAccountNumber(String value) {
        this.counterAccountNumber = value;
        return this;
    }

    public TransactionBuilder withDescription(String value) {
        this.description = value;
        return this;
    }

    public Transaction build() {
        return new Transaction(
            this.transactionId,
            this.transactionDate,
            this.accountNumber,
            this.currency,
            this.credit,
            this.amount,
            this.counterAccountName,
            this.counterAccountNumber,
            this.description
        );
    }
}
