package com.sirdarey.structural.decorator;

// Base Decorator
abstract class BaseCoffeeDecorator implements Coffee {

    private final Coffee decoratedCoffee;

    public BaseCoffeeDecorator(Coffee c) {
        this.decoratedCoffee = c;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}