package com.sirdarey.structural.decorator;

// Concrete Decorators
class MilkCoffeeDecorator extends BaseCoffeeDecorator {

    public MilkCoffeeDecorator(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}