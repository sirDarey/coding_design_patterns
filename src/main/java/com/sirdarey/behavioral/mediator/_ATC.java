package com.sirdarey.behavioral.mediator;

interface _ATC {

    void registerFlight(_Flight flight);

    void sendMessage(String message, _Flight sender);
}