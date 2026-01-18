package com.sirdarey.structural.adapter;

class AdapterUsage {

    /**
     * The adapter pattern allows incompatible interfaces to work together.
     * It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Adapter Pattern Demo -----\n");

        PayPalAPI legacyApi = new PayPalAPI();

        // Client only knows about PaymentProcessor, it doesn't care it's actually PayPal
        PaymentProcessor processor = new PayPalAdapter(legacyApi);
        processor.processPayment(50.0); // Output: PayPal: Paid 50.0 USD

        System.out.println("\n-----Ending Adapter Pattern Demo -----\n");
    }
}