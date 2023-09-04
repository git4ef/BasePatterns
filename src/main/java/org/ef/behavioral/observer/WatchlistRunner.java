package org.ef.behavioral.observer;

public class WatchlistRunner {
    public static void main(String[] args) {
        PriceProvider priceProvider = new PriceProvider();

        priceProvider.addToken("Token1");
        priceProvider.addToken("Token2");
        priceProvider.addToken("Token3");
        priceProvider.addToken("Token4");

        Observer watcher1 = new Watchers("account1");
        Observer watcher2 = new Watchers("account2");

        priceProvider.addObserver(watcher1);
        priceProvider.addObserver(watcher2);

        priceProvider.removeToken("Token1");
    }
}
