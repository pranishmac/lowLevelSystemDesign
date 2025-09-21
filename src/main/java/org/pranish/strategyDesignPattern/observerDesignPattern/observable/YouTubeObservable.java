package org.pranish.strategyDesignPattern.observerDesignPattern.observable;
import org.pranish.strategyDesignPattern.observerDesignPattern.observer.Observer;
import java.util.*;

public class YouTubeObservable implements Observable {

    private List<Observer> obs = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        obs.add(o);
    }

    @Override
    public void detach(Observer o) {
        obs.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o: obs){
            o.update(message);
        }
    }

    public void uploadVideo(String message){
        System.out.println("Video has been uploaded");
        notifyObservers(message);
    }
}
