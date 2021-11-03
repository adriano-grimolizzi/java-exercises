package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void shouldCorrectlyCalculateBill() {
        CustomerBill customerBill = new CustomerBill(BillingStrategy.normalStrategy());
        customerBill.add(80, 2);
        customerBill.setStrategy(BillingStrategy.happyHourStrategy());
        customerBill.add(50, 3);
        assertEquals(80 * 2 + 50 * 3 / 2, customerBill.getBill());
    }
}
