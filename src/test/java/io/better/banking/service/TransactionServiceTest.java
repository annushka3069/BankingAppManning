package io.better.banking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.better.banking.model.Transaction;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class TransactionServiceTest {

  private TransactionService transactionService;

  @BeforeEach
  void setup() {
    transactionService = new TransactionService();
  }

  @Test
  void testFindAllByAccountNumber() {

    var accountNumber="ab234";

    List<Transaction> nbTransactions = Arrays.asList(buildTransaction(accountNumber), buildTransaction(accountNumber), buildTransaction(accountNumber));

    var resultat = transactionService.findAllByAccountNumber(accountNumber);

    assertEquals(nbTransactions, resultat);

  }

  private Transaction buildTransaction(String accountNumber){
    return new Transaction("bancaire", LocalDate.now(),accountNumber, "CAD", 12.0, "marchetau", "logovert");
  }
}
