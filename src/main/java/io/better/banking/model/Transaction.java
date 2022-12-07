package io.better.banking.model;

import java.util.Date;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(force=true)
public class Transaction {

  @Id
  private final Long id;
  private final String type;
  private final Date date;
  private final Integer accountNumber;
  private final String currency;
  private final double amount;
  private final String merchantName;
  private final String merchantLogo;

}
