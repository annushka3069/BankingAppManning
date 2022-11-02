package io.better.banking.service;

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

    var resultat = transactionService.findAllByAccountNumber(43215);

    assert(resultat.size() > 0);

  }
}
