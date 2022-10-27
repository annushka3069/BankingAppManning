package io.better.banking.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class Transaction {

  private final String type;
  private final LocalDate date;
  private final String accountNumber;
  private final String currency;
  private final double amount;
  private final String merchantName;
  private final String merchantLogo;


}
