package org.ef.structural.proxy;

public class TrackingRunner {
    public static void main(String[] args) {
        Portfolio portfolio = new ProxyPortfolio("some token");
        portfolio.tracking();
    }
}
