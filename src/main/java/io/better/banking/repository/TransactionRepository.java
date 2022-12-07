package io.better.banking.repository;

import io.better.banking.model.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

    List<Transaction> findTransactionsByAccountNumber(Integer accountNumber);
}
