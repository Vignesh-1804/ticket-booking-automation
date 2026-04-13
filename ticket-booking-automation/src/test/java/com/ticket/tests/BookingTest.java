package com.ticket.tests;

import org.testng.annotations.Test;

import com.ticket.pages.HomePage;
import com.ticket.pages.LoginPage;
import com.ticket.pages.PaymentPage;
import com.ticket.pages.SeatSelectionPage;

public class BookingTest extends BaseTest {

    @Test
    public void ticketBookingTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SeatSelectionPage seatPage = new SeatSelectionPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);

        loginPage.enterUsername("student");
        Thread.sleep(1000);

        loginPage.enterPassword("Password123");
        Thread.sleep(1000);

        loginPage.clickLogin();
        Thread.sleep(1000);

        homePage.selectMovie();
        Thread.sleep(1000);

        homePage.clickBookNow();
        Thread.sleep(1000);

        seatPage.selectSeat();
        Thread.sleep(1000);

        seatPage.confirmSeat();
        Thread.sleep(1000);

        paymentPage.enterCardDetails("1234567890123456", "12/28", "123");
        Thread.sleep(1000);

        paymentPage.clickPayNow();
        Thread.sleep(5000);
    }
}