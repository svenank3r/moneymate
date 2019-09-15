package com.srgms.moneymate.model.transaction;

import com.srgms.moneymate.model.currency.Currency;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {

    @Id
    private Long transactionId;

    @CreationTimestamp
    private LocalDateTime transactionDate;

    @NotNull
    private String accountNumber;

    @NotNull
    private Currency currency;

    @NotNull
    private boolean credit; // False if debit

    @NotNull
    private Double amount;

    private String counterAccountName;

    private String counterAccountNumber;

    private String description;

    public Transaction(
        Long transactionId,
        LocalDateTime transactionDate,
        String accountNumber,
        Currency currency,
        boolean credit,
        Double amount,
        String counterAccountName,
        String counterAccountNumber,
        String description
    ) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.credit = credit;
        this.amount = amount;
        this.counterAccountName = counterAccountName;
        this.counterAccountNumber = counterAccountNumber;
        this.description = description;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public boolean getCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCounterAccountName() {
        return counterAccountName;
    }

    public void setCounterAccountName(String counterAccountName) {
        this.counterAccountName = counterAccountName;
    }

    public String getCounterAccountNumber() {
        return counterAccountNumber;
    }

    public void setCounterAccountNumber(String counterAccountNumber) {
        this.counterAccountNumber = counterAccountNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return getAmount() == that.getAmount() &&
            Objects.equals(getTransactionId(), that.getTransactionId()) &&
            Objects.equals(getTransactionDate(), that.getTransactionDate()) &&
            Objects.equals(getAccountNumber(), that.getAccountNumber()) &&
            Objects.equals(getCurrency(), that.getCurrency()) &&
            Objects.equals(getCredit(), that.getCredit()) &&
            Objects.equals(getCounterAccountName(), that.getCounterAccountName()) &&
            Objects.equals(getCounterAccountNumber(), that.getCounterAccountNumber()) &&
            Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getTransactionId(),
            getTransactionDate(),
            getAccountNumber(),
            getCurrency(),
            getCredit(),
            getAmount(),
            getCounterAccountName(),
            getCounterAccountNumber(),
            getDescription()
        );
    }
}
