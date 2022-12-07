package io.better.banking.service;

import io.better.banking.model.Transaction;
import java.util.List;

import io.better.banking.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {

  private final TransactionRepository transactionRepository;

  public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
    return transactionRepository.findTransactionsByAccountNumber(accountNumber);
  }
}
