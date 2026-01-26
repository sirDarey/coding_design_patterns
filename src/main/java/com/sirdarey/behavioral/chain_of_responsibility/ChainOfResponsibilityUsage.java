package com.sirdarey.behavioral.chain_of_responsibility;

class ChainOfResponsibilityUsage {

    /**
     * The Chain of Responsibility Pattern passes a request along a chain of handlers.
     * It is used to decouple the sender of a request from its receivers, giving more than one object a chance to handle the request
     * (e.g., Logging filters, Exception handling, or Support desks).
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Chain of Responsibility Demo -----\n");

        // 1. Build the chain
        _1_SupportHandler level1 = new _2_FirstLevelSupport();
        _1_SupportHandler manager = new _2_ManagerSupport();

        level1.setNext(manager);

        // 2. Process requests
        System.out.println("Client: Sending BASIC ticket...");
        level1.handleRequest("BASIC");

        System.out.println("\nClient: Sending CRITICAL ticket...");
        level1.handleRequest("CRITICAL");

        System.out.println("\n----- Ending Chain of Responsibility Demo -----\n");
    }
}