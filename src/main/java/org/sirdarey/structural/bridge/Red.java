package org.sirdarey.structural.bridge;

// Concrete Implementors
class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}