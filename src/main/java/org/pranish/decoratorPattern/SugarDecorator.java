package org.pranish.decoratorPattern;

public class SugarDecorator extends CoffeeDecorator{
    SugarDecorator(BaseCoffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " ,Sugar(extra)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }
}
