package org.sirdarey.structural.facade;

class ComputerFacade {

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }


    // Simple interface for the client
    public void start() {
        System.out.println("Starting Computer...");
        cpu.freeze();
        memory.load(0, hardDrive.read(0, 1024));
        System.out.println("Computer Started.");
    }
}