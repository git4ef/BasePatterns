package org.ef.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class PriceProvider implements Observed{

    List<String> tokens = new ArrayList<>();
    List<Observer> watchers = new ArrayList<Observer>();

    public void addToken(String token){
        this.tokens.add(token);
        notifyObservers();
    }

    public void removeToken(String token){
        this.tokens.remove(token);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.watchers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.watchers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: watchers) {
            observer.HandleEvent(this.tokens);
        }
    }
}
