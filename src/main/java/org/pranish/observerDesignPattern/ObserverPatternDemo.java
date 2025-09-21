package org.pranish.observerDesignPattern;

import org.pranish.observerDesignPattern.observable.Observable;
import org.pranish.observerDesignPattern.observable.YouTubeObservable;
import org.pranish.observerDesignPattern.observer.Observer;
import org.pranish.observerDesignPattern.observer.SubscriberObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observable channel = new YouTubeObservable();

        Observer obs1 = new SubscriberObserver("user1");
        Observer obs2 = new SubscriberObserver("user2");
        Observer obs3 = new SubscriberObserver("user3");

        channel.attach(obs1);
        channel.attach(obs2);
        channel.attach(obs3);
        channel.attach(obs3);
        channel.detach(obs1);

        ((YouTubeObservable) channel).uploadVideo("Observer Design Pattern Explained!");
    }
}
