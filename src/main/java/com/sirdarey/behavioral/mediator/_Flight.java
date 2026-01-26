package com.sirdarey.behavioral.mediator;

class _Flight {

    private final _ATC atc;
    private final String flightNumber;

    public _Flight(_ATC atc, String flightNumber) {
        this.atc = atc;
        this.flightNumber = flightNumber;
        atc.registerFlight(this);
    }

    public void send(String msg) {
        System.out.println(flightNumber + " sending: " + msg);
        atc.sendMessage(msg, this);
    }

    public void receive(String msg, _Flight sender) {
        System.out.println(flightNumber + " received: " + msg + " from "+sender.flightNumber);
    }
}