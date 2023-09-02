package org.ef.structural.proxy;

public class ProxyPortfolio implements Portfolio{
    private String tokenName;
    private SomePortfolio somePortfolio;

    public ProxyPortfolio(String tokenName) {
        this.tokenName = tokenName;
    }

    @Override
    public void tracking() {
        if(somePortfolio == null){
            somePortfolio = new SomePortfolio(tokenName);
        }
        somePortfolio.tracking();

        System.out.println("Adding tracking supply from tokens in Proxy");
    }
}
