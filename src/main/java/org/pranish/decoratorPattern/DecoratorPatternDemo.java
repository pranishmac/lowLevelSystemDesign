package org.pranish.decoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        BaseCoffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " -> " + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> " + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> " + coffee.getCost());



    }
}
