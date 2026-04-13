package com.ticket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    WebDriver driver;

    By cardNumber = By.id("cardNumber");
    By expiryDate = By.id("expiryDate");
    By cvv = By.id("cvv");
    By payButton = By.id("payNow");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterCardDetails(String card, String expiry, String securityCode) {
        driver.findElement(cardNumber).sendKeys(card);
        driver.findElement(expiryDate).sendKeys(expiry);
        driver.findElement(cvv).sendKeys(securityCode);
    }

    public void clickPayNow() {
        driver.findElement(payButton).click();
    }
}