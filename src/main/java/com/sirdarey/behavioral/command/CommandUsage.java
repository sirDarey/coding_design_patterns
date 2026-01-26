package com.sirdarey.behavioral.command;

class CommandUsage {

    /**
     * The Command Pattern turns a request into a stand-alone object that contains all information about the request.
     * This allows you to parameterize methods with different requests, delay or queue a request's execution,
     * and support undoable operations.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Command Pattern Demo -----\n");

        // Receiver
        _2_Light livingRoomLight = new _2_Light();

        // Command
        _1_Command lightOn = new _3_TurnOnLightCommand(livingRoomLight);

        // Invoker
        _4_RemoteControl remote = new _4_RemoteControl();

        // Execute
        remote.setCommand(lightOn);
        remote.pressButton(); // Output: Light is ON

        System.out.println("... User realizes they want it dark ...");

        // 2. Undo Command
        remote.pressUndo();   // Output: Undoing command... Light is OFF

        System.out.println("\n----- Ending Command Pattern Undo Demo -----\n");
    }
}