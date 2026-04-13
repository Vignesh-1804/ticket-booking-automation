package com.ticket.tests;

import org.testng.annotations.Test;

public class ConcurrencyTest extends BaseTest {

    @Test
    public void multipleUsersBookingTest() {
        System.out.println("Testing multiple users booking tickets at the same time");
    }
}