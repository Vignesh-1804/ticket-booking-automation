package com.ticket.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ticket.utils.DriverSetup;

public class BaseTest {

    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverSetup.getDriver();
        driver.get("file:///C:/Users/vigne/OneDrive/Desktop/TicketBookingAutomation/ticket-booking-automation/src/test/resources/index.html");
    }

    @AfterMethod
    public void tearDown() {
        DriverSetup.quitDriver();
    }
}