package com.ticket.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeatSelectionPage {

    WebDriver driver;

    By seatDropdown = By.id("seat");
    By confirmSeatButton = By.id("confirmSeat");

    public SeatSelectionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSeat() {
        Select select = new Select(driver.findElement(seatDropdown));
        select.selectByVisibleText("Seat A1");
    }

    public void confirmSeat() {
        driver.findElement(confirmSeatButton).click();
    }
}