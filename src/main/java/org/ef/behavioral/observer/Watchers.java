package org.ef.behavioral.observer;

import java.util.List;

public class Watchers implements Observer {
    String accountName;

    public Watchers(String name) {
        this.accountName = name;
    }

    @Override
    public void HandleEvent(List<String> tokens) {
        System.out.println(accountName + ", we have some changes in watchlist." + tokens);
    }
}
