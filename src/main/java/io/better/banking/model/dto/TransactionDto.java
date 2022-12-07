package io.better.banking.model.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TransactionDto {

    private String type;
    private Date date;
    private Integer accountNumber;
    private String currency;
    private double amount;
    private String merchantName;
    private String merchantLogo;
}
