package com.sirdarey.behavioral.mediator;

class MediatorUsage {

    /**
     * The Mediator Pattern restricts direct communications between objects and forces them to collaborate only via a mediator object.
     * This reduces chaotic dependencies between objects (spaghetti code), making the system easier to refactor.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Mediator Pattern Demo -----\n");

        _ATC atcTower = new _Tower();

        _Flight flight101 = new _Flight(atcTower, "Flight 101");
        _Flight flight202 = new _Flight(atcTower, "Flight 202");
        _Flight flight303 = new _Flight(atcTower, "Flight 303");

        // Flight 101 sends a message; 202 and 303 receive it.
        flight101.send("Requesting landing clearance...");

        System.out.println("\n----- Ending Mediator Pattern Demo -----\n");
    }
}