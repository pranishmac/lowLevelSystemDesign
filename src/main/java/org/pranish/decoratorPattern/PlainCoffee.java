package org.pranish.decoratorPattern;

public class PlainCoffee implements BaseCoffee {

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
