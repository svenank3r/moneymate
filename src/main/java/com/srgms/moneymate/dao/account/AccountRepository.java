package com.srgms.moneymate.dao.account;

import com.srgms.moneymate.model.account.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {}
