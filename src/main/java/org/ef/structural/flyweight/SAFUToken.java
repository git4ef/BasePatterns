package org.ef.structural.flyweight;

public class SAFUToken implements Token {

    @Override
    public void AddTokenToPortfolio() {
        System.out.println("SAFU token is tracked.");
    }
}
