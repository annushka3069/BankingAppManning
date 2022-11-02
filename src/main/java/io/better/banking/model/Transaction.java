package io.better.banking.model;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Transaction {

  private final String type;
  private final Date date;
  private final Integer accountNumber;
  private final String currency;
  private final double amount;
  private final String merchantName;
  private final String merchantLogo;


}
