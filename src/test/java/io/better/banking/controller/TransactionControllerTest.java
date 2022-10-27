package io.better.banking.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import io.better.banking.model.Transaction;
import io.better.banking.service.TransactionService;
import java.time.LocalDate;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TransactionController.class)
@ExtendWith(MockitoExtension.class)
class TransactionControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private TransactionService transactionService;

  @Test
  void testFindAllByAccountNumber() throws Exception {

    when(transactionService.findAllByAccountNumber(anyString())).thenReturn(Arrays.asList(buildTransaction("abc123"), buildTransaction("abc123"), buildTransaction("abc123")));

    mockMvc.perform(get("/transactions/abc"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$", hasSize(3)));
  }

  private Transaction buildTransaction(String accountNumber){
    return new Transaction("bancaire", LocalDate.now(), accountNumber, "CAD", 12.0, "marchetau", "logovert");
  }


}
