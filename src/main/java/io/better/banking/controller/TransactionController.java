package io.better.banking.controller;

import io.better.banking.model.Transaction;
import io.better.banking.model.dto.TransactionDto;
import io.better.banking.service.TransactionService;
import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path="/transactions", produces = "application/json")
public class TransactionController {

  private final TransactionService transactionService;

  @GetMapping("/{accountNumber}")
  public ResponseEntity<List<TransactionDto>> findAllByAccountNumber(@PathVariable("accountNumber") final Integer accountNumber) {
    return new ResponseEntity<>(transactionService
            .findAllByAccountNumber(accountNumber)
            .stream()
            .map(this::convertToDto)
            .collect(Collectors.toList())
            , HttpStatus.OK);
  }

  private TransactionDto convertToDto(Transaction transaction){
    ModelMapper modelMapper = new ModelMapper();
    return modelMapper.map(transaction, TransactionDto.class);

  }

}
