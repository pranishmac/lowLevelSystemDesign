package org.pranish.decoratorPattern;

abstract class CoffeeDecorator implements BaseCoffee{
    public BaseCoffee coffee;

    CoffeeDecorator(BaseCoffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
