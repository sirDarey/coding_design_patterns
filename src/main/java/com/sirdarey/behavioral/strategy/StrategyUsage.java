package com.sirdarey.behavioral.strategy;

class StrategyUsage {

    /**
     * The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
     * This is useful when you have multiple ways to do a specific task (like payment, sorting, or compression)
     * and want to switch between them at runtime without changing the client code.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Strategy Pattern Demo -----\n");

        // 1. Pay via PayPal
        _3_CheckoutService service = new _3_CheckoutService(new _2_PayPalPayment());
        service.processOrder(100);

        // 2. Switch strategy to Credit Card dynamically
        service = new _3_CheckoutService(new _2_CreditCardPayment());
        service.processOrder(250);

        System.out.println("\n----- Ending Strategy Pattern Demo -----\n");
    }
}