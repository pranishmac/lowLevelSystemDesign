package org.pranish.observerDesignPattern.observer;

public class SubscriberObserver implements Observer{
    private String name;

    public SubscriberObserver(String name){
        this.name =  name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification has been received !"+message);
    }
}
