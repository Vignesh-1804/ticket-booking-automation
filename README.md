# Ticket Booking Automation Framework

A Selenium-based automation testing framework for a movie ticket booking application.

This project automates the complete booking flow including:
- Login
- Movie selection
- Seat selection
- Payment process

The framework is developed using Java, Selenium WebDriver, TestNG, and Maven.

---

## Features

- Automated login functionality
- Automated movie selection
- Automated seat booking
- Automated payment flow
- Page Object Model (POM) design pattern
- Maven project structure
- TestNG test execution
- Chrome browser automation
- Modern HTML demo UI for testing

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver
- HTML
- CSS

---

## Project Structure

ticket-booking-automation
│
├── src
│   ├── main
│   │   └── java/com/ticket
│   │       ├── pages
│   │       │   ├── HomePage.java
│   │       │   ├── LoginPage.java
│   │       │   ├── PaymentPage.java
│   │       │   └── SeatSelectionPage.java
│   │       └── utils
│   │           └── DriverSetup.java
│   │
│   └── test
│       ├── java/com/ticket/tests
│       │   ├── BaseTest.java
│       │   ├── BookingTest.java
│       │   └── ConcurrencyTest.java
│       │
│       └── resources
│           └── index.html
│
├── pom.xml
├── testng.xml
└── README.md

## Prerequisites

Before running the project, install:

* Java JDK 17 or above
* Maven
* Google Chrome browser
* VS Code or IntelliJ IDEA

## Test Scenario

The automation performs the following steps:

1. Open the ticket booking page
2. Enter username and password
3. Click login
4. Select a movie
5. Click Book Now
6. Select seat
7. Confirm seat
8. Enter card details
9. Click Pay Now

---

## Demo Credentials


Username: student
Password: Password123


---

## Sample Automation Flow

* Login Page
* Movie Selection
* Seat Selection
* Payment Page

---

## Author

A. Vigneshwaran

BE Electronics Student | Aspiring Software Developer

