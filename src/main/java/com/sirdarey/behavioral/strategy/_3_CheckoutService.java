package com.sirdarey.behavioral.strategy;

// 3. Context
class _3_CheckoutService {

    private final _1_PaymentStrategy strategy;

    public _3_CheckoutService(_1_PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(int amount) {
        strategy.pay(amount); // Context doesn't know concrete type
    }
}