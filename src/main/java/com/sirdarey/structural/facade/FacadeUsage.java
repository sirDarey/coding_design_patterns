package com.sirdarey.structural.facade;

class FacadeUsage {

    /**
     * Facade Pattern: Provides a simplified interface to a complex subsystem.
     * In this example, the ComputerFacade class simplifies the process of starting a computer
     * by hiding the complexities of CPU, Memory, and HardDrive interactions.
     */

    public static void main(String[] args) {

        System.out.println("\n--- Facade Pattern Example ---\n");

        // Client doesn't need to know about CPU/RAM complexity
        ComputerFacade computer = new ComputerFacade();
        computer.start();

        System.out.println("\n--- End of Facade Pattern Example ---\n");
    }
}