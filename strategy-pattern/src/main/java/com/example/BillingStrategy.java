package com.example;

interface BillingStrategy {

    int getActPrice(int rawPrice);

    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happyHourStrategy() {
        return rawPrice -> rawPrice / 2;
    }
}
