package com.sirdarey.behavioral.command;

//2. Receiver (The device doing the work)
class _2_Light {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}