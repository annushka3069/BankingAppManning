package io.better.banking.service;

import io.better.banking.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith({MockitoExtension.class})
class TransactionServiceTest {

  @Mock
  private TransactionRepository transactionRepository;
  private TransactionService transactionService;

  @Test
  void testFindAllByAccountNumber() {

    assertEquals(1, transactionService.findAllByAccountNumber(43215).size());

  }
}
