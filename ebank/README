# BankAccount Microservice

## Overview

This project is a simple REST API microservice for managing bank accounts. It's built using Spring Boot, leveraging Spring Data JPA for persistence and Spring Web for RESTful endpoints. The service uses an H2 in-memory database for data storage.

## Features

- Create new bank accounts
- Retrieve account details
- Update account information
- Delete accounts
- List all accounts

## Technologies

- Java 21
- Spring Boot 3.x
- Spring Data JPA
- Spring Web
- H2 Database
- Lombok

## Getting Started

### Prerequisites

- JDK 21 or later

## API Endpoints

- POST bankAccount - Create a new account
- GET bankAccount/{id} - Retrieve an account
- PUT bankAccount/{id} - Update an account
- DELETE bankAccount/{id} - Delete an account
- GET bankAccounts - List all accounts

## Database

The application uses H2 in-memory database. The console is enabled and can be accessed at `http://localhost:8080/h2-console`.

Default credentials:

- JDBC URL: jdbc:h2:mem:account-db
- Username: sa
- Password: (leave blank)

## Configuration

Key application properties (src/main/resources/application.properties):

```
spring.datasource.url=jdbc:h2:mem:account-db
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```
