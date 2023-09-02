package org.ef.structural.proxy;

public class SomePortfolio implements Portfolio {

    private String nameToken;

    public SomePortfolio(String nameToken) {
        this.nameToken = nameToken;
        addToken();
    }

    public void addToken(){
        System.out.println("Adding token " + nameToken);
    }
    @Override
    public void tracking() {
        System.out.println("token price tracking: " + nameToken);
    }
}
