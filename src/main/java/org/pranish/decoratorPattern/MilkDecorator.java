package org.pranish.decoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
    MilkDecorator(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " ,Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10;
    }
}
