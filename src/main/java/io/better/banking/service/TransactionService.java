package io.better.banking.service;

import io.better.banking.model.Transaction;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

  public List<Transaction> findAllByAccountNumber(final Integer accountNumber) {
    return List.of(
        Transaction
            .builder()
            .type("credit")
            .date(new Date())
            .accountNumber(accountNumber)
            .currency("CAD")
            .amount(1200.00)
            .merchantName("Marche Tau")
            .merchantLogo("logovert.png")
            .build());
  }
}
