package com.sirdarey.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class _Tower implements _ATC {

    private final List<_Flight> flights = new ArrayList<>();

    public void registerFlight(_Flight flight) {
        flights.add(flight);
    }

    public void sendMessage(String message, _Flight sender) {
        for (_Flight flight : flights) {
            // Don't send message back to sender
            if (flight != sender) {
                flight.receive(message, sender);
            }
        }
    }
}