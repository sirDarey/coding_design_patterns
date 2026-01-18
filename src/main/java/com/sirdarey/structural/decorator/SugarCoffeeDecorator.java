package com.sirdarey.structural.decorator;

class SugarCoffeeDecorator extends BaseCoffeeDecorator {

    public SugarCoffeeDecorator(Coffee c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}