package com.ebank.ebank;

import java.util.Date;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ebank.ebank.entities.BankAccount;
import com.ebank.ebank.enums.AccountType;
import com.ebank.ebank.repositories.BankAccountRepository;

@SpringBootApplication
public class EbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(EbankApplication.class, args);
	}

	@Bean
	CommandLineRunner start(BankAccountRepository bankAccountRepository) {
		return args -> {
			BankAccount account = BankAccount.builder()
					.id(UUID.randomUUID().toString())
					.type(Math.random() > 0.5 ? AccountType.CURRENT_ACCOUNT : AccountType.SAVING_ACCOUNT)
					.currency("MAD")
					.balance(Math.random())
					.createdAt(new Date())
					.build();

			bankAccountRepository.save(account);
		};
	}

}
