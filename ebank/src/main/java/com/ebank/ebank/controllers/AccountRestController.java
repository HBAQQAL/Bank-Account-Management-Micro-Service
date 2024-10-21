package com.ebank.ebank.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.ebank.ebank.entities.BankAccount;
import com.ebank.ebank.repositories.BankAccountRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AccountRestController {

  private BankAccountRepository bankAccountRepository;

  public AccountRestController(BankAccountRepository bankAccountRepository) {
    this.bankAccountRepository = bankAccountRepository;
  }

  @GetMapping("/bankAccounts")
  public List<BankAccount> bankAccounts() {
    return bankAccountRepository.findAll();
  }

  @GetMapping("/bankAccount/{id}")
  public BankAccount bankAccount(@PathVariable String id) {
    return bankAccountRepository.findById(id)
        .orElseThrow(() -> new RuntimeException(String.format("Account not found")));
  }

  @PostMapping("/bankAccount")
  public BankAccount createAccount(@RequestBody BankAccount bankAccount) {
    BankAccount newBankAccount = bankAccountRepository.save(bankAccount);
    return newBankAccount;
  }

}
