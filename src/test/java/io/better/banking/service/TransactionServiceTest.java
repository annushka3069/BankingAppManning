package io.better.banking.service;

import io.better.banking.BankingApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith({MockitoExtension.class})
@SpringBootTest(classes = {BankingApplication.class})
class TransactionServiceTest {

  @Autowired
  private TransactionService transactionService;

  @Test
  void testFindAllByAccountNumber() {

    assertEquals(1, transactionService.findAllByAccountNumber(43215).size());

  }
}
