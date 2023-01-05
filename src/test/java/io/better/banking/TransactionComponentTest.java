package io.better.banking;

import static io.restassured.http.ContentType.JSON;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import io.better.banking.controller.TransactionController;
import io.better.banking.repository.TransactionRepository;
import io.better.banking.service.TransactionService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {BankingApplication.class})
class TransactionComponentTest {

  @Mock
  private TransactionRepository transactionRepository;

  @BeforeEach
  public void initialiseRestAssuredMockMvcStandalone() {
    RestAssuredMockMvc.standaloneSetup(new TransactionController(new TransactionService(transactionRepository)));
  }

  @Test
  void testFindAllByAccountNumber(){
    var accountNumber=2345;
    given()
        .when()
        .get("/transactions/"+accountNumber)
        .then()
        .log().ifValidationFails()
        .statusCode(200)
        .contentType(JSON);
  }

}
