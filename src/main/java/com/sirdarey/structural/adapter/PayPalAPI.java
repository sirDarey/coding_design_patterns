package com.sirdarey.structural.adapter;

// Adaptee (The incompatible 3rd party library)
class PayPalAPI {

    public void makePayment(double value, String currency) {
        System.out.println("PayPal: Paid " + value + " " + currency);
    }
}