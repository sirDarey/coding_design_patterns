package org.sirdarey.structural.bridge;

// Abstraction (Shape)
abstract class Shape {

    protected Color color; // The "Bridge"

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}