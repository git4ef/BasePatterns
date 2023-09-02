package org.ef.structural.flyweight;

public class LFGToken implements Token{

    @Override
    public void AddTokenToPortfolio() {
        System.out.println("LFG token is tracked.");
    }
}
