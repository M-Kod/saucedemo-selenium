# SauceDemo Selenium Tests

![UI Tests](https://github.com/M-Kod/saucedemo-selenium/actions/workflows/tests.yml/badge.svg)

## About
UI test automation project for the login page of [SauceDemo](https://www.saucedemo.com/).
The tests cover one positive and two negative login scenarios.

## Tech stack
- Java 25
- Selenium WebDriver
- TestNG
- Maven
- Google Chrome

## Test cases
| Test | Description |
|---|---|
| `successfulLogin` | Verifies that a standard user can log in and sees the Products page |
| `wrongPasswordShowsError` | Verifies that an error message is shown for a wrong password |
| `lockedUserCannotLogin` | Verifies that a locked user cannot log in and sees an error message |

## How to run
**Prerequisites:** Java 25, Maven and Google Chrome installed.

```bash
git clone https://github.com/M-Kod/saucedemo-selenium.git
cd saucedemo-selenium
mvn test
```

Or open the project in IntelliJ IDEA and run `LoginTest`.
