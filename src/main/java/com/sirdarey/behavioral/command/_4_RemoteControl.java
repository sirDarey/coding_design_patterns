package com.sirdarey.behavioral.command;

//4. Invoker (The Remote)
class _4_RemoteControl {

    private _1_Command command;

    public void setCommand(_1_Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }

    public void pressUndo() {
        if (command != null) {
            command.undo();
        }
    }
}