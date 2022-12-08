package io.better.banking.model;

import java.util.Date;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(force=true)
@Table(name = "transactions")
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private final Long id;
  private final String type;
  private final Date date;
  private final Integer accountNumber;
  private final String currency;
  private final double amount;
  private final String merchantName;
  private final String merchantLogo;

}
