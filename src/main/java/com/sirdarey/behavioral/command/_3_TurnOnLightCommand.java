package com.sirdarey.behavioral.command;

//3. Concrete Command
class _3_TurnOnLightCommand implements _1_Command {

    private final _2_Light light;

    public _3_TurnOnLightCommand(_2_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        System.out.println("Undoing command...");
        light.turnOff(); // Reverses the execute action
    }
}