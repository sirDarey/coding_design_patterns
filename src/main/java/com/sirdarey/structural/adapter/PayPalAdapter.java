package com.sirdarey.structural.adapter;

// Adapter (The bridge)
class PayPalAdapter implements PaymentProcessor {

    private final PayPalAPI payPalAPI;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.payPalAPI = payPalAPI;
    }

    @Override
    public void processPayment(double amount) {
        // Translate the call from "processPayment" to "makePayment"
        payPalAPI.makePayment(amount, "USD");
    }
}