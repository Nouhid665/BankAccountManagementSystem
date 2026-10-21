# Bank Account Management System

## Project Description
The Bank Account Management System is a Java console-based application that manages basic banking operations. It allows users to create bank accounts, deposit money, withdraw money, check account balances, and display account details.

This mini-project demonstrates Object-Oriented Programming (OOP) concepts in Java.

## Features
- Create a new bank account
- Support Savings and Current accounts
- Display account details
- Deposit money into an account
- Withdraw money from an account
- Check the current account balance
- Handle invalid inputs and banking operations using exception handling

## Technologies Used
- **Programming Language:** Java
- **Concepts:** Encapsulation, Inheritance, Polymorphism, Constructors, Exception Handling
- **Data Structure:** HashMap
- **Interface:** Console-based menu

## Project Structure
```text
BankAccountManagementSystem/
├── Main.java
├── BankAccount.java
├── SavingsAccount.java
├── CurrentAccount.java
├── README.md
└── .gitignore
```

## Requirements
- Java Development Kit (JDK)
- A terminal or command prompt
- A Java-compatible IDE (optional)

## How to Run

1. Download or clone this repository.
2. Open a terminal in the project directory.
3. Compile the Java files:

   ```bash
   javac *.java
   ```

4. Run the application:

   ```bash
   java Main
   ```

## Menu Options
1. Create Account
2. Display Account Details
3. Deposit Money
4. Withdraw Money
5. Check Balance
6. Exit

## OOP Concepts Demonstrated
- **Encapsulation:** Account details are stored in private fields.
- **Inheritance:** SavingsAccount and CurrentAccount inherit from BankAccount.
- **Polymorphism:** Account subclasses override the getAccountType() method.
- **Constructors:** Initialize account objects.
- **Exception Handling:** Handles invalid amounts, insufficient balances, and invalid input.

## Limitations
- Account data is stored in memory and is lost when the application closes.
- The application is an educational simulation and is not intended for real banking transactions.

## Future Enhancements
- Integrate a database for permanent storage.
- Add user authentication.
- Implement account-specific rules and transaction history.
- Develop a graphical user interface.

## Project Type
College Mini-Project

## Author
Add the names and roll numbers of all group members here.
