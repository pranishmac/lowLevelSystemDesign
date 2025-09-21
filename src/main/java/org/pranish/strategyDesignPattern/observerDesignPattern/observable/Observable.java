package org.pranish.strategyDesignPattern.observerDesignPattern.observable;

import org.pranish.strategyDesignPattern.observerDesignPattern.observer.Observer;

public interface Observable {
    public void attach(Observer o);

    public void detach(Observer o);

    public void notifyObservers(String message);
}
