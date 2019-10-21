package com.srgms.moneymate.model.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name = "ACCOUNTS")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;

    @NotEmpty(message = "Accountname may not be empty")
    private String accountName;

    @NotEmpty(message = "Accountnumber may not be empty")
    private String accountNumber;

    @NotEmpty(message = "Account username may not be empty")
    private String accountUserName;

    @NotEmpty(message = "Accounttype may not be empty")
    private String accountType;

    public Account() {
    }

    public Account(
        String accountName, String accountNumber, String accountUserName, String accountType
    ) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountUserName = accountUserName;
        this.accountType = accountType;
    }

    public Long getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public String getAccountType() {
        return accountType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return getAccountId().equals(account.getAccountId()) && getAccountName().equals(account.getAccountName()) && getAccountNumber().equals(
            account.getAccountNumber()) && getAccountUserName().equals(account.getAccountUserName()) && getAccountType().equals(account.getAccountType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountId(), getAccountName(), getAccountNumber(), getAccountUserName(), getAccountType());
    }
}
