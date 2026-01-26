package com.sirdarey.behavioral.strategy;

//2. Concrete Strategies
class _2_CreditCardPayment implements _1_PaymentStrategy {

    public void pay(int amount) {
        System.out.println("Paid $" + amount + " via Credit Card.");
    }
}