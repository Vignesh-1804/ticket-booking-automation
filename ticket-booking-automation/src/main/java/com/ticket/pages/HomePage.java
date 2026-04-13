package com.ticket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By movieOption = By.id("movie");
    By bookNowButton = By.id("bookNow");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectMovie() {
        driver.findElement(movieOption).click();
    }

    public void clickBookNow() {
        driver.findElement(bookNowButton).click();
    }
}