package io.better.banking.service;

import io.better.banking.model.Transaction;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

  public List<Transaction> findAllByAccountNumber(String accountNumber) {
    return Arrays.asList(buildTransaction(accountNumber), buildTransaction(accountNumber), buildTransaction(accountNumber));
  }

  private Transaction buildTransaction(String accountNumber){
    return new Transaction("bancaire", LocalDate.now(),accountNumber, "CAD", 12.0, "marchetau", "logovert");
  }

}
