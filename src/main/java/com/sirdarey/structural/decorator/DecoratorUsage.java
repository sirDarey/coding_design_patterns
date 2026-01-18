package com.sirdarey.structural.decorator;

class DecoratorUsage {

    /**
     * The decorator pattern allows behavior to be added to individual objects,
     * either statically or dynamically, without affecting the behavior of other objects from the same class.
     * In this example, we demonstrate how to use the decorator pattern to add features to a coffee object.
     */

    public static void main(String[] args) {

        System.out.println("\n-----Starting Decorator Pattern Demo -----\n");

        // Base coffee
        Coffee myCoffee = new SimpleCoffee();

        // Add Milk dynamically
        myCoffee = new MilkCoffeeDecorator(myCoffee);

        // Add Sugar dynamically
        myCoffee = new SugarCoffeeDecorator(myCoffee);

        System.out.println(myCoffee.getDescription()); // Output: Simple Coffee, Milk, Sugar
        System.out.println("Cost: $" + myCoffee.getCost()); // Output: Cost: $7.0

        System.out.println("\n-----Ending Decorator Pattern Demo -----\n");
    }
}