package com.srgms.moneymate.repositories.transactions;

import com.srgms.moneymate.model.transaction.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transaction, Long> {
}
