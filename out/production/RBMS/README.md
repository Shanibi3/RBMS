# Rural Bank Account Management System (RBAMS)

## Overview
This Java console-based application simulates a basic banking system for the Rural Bank of Nepal (RBN). It helps manage customer savings and current accounts while demonstrating Object-Oriented Programming (OOP) principles and custom exception handling.

## Features
- Supports multiple accounts (Savings and Current) per customer.
- Allows deposit and withdrawal operations.
- Applies interest to savings accounts.
- Handles overdraft limit for current accounts.
- Throws and handles custom exceptions (e.g., InsufficientBalanceException).
- Simple console-based menu interaction.

## Class Design and OOP Implementation

### 1. `BankAccount` (Abstract Class)
- Attributes: `accountHolderName`, `accountNumber`, `balance`
- Methods: `deposit()`, `withdraw()` (abstract), `displayAccountDetails()`
- Demonstrates **abstraction** and **inheritance**

### 2. `SavingsAccount` and `CurrentAccount`
- Inherit from `BankAccount`
- `SavingsAccount`: Adds interest with `addInterest()` method
- `CurrentAccount`: Supports overdraft limit
- Showcases **polymorphism** via overridden `withdraw()`

### 3. `Customer`
- Aggregates multiple `BankAccount` objects (shows **aggregation**)
- Maintains customer-specific details

### 4. `InsufficientBalanceException`
- Custom checked exception thrown for invalid withdrawals

### 5. `RBAMS` (Main class)
- Menu-driven interface for user interaction
- Handles user input and transaction flow
- Demonstrates exception handling and **encapsulation**

## How to Run
1. Compile all `.java` files:
   ```bash
   javac *.java
