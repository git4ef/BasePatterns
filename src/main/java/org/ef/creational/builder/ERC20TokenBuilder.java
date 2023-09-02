package org.ef.creational.builder;

public class ERC20TokenBuilder extends TokenBuilder {
    @Override
    void buildName() {
        token.setName("token");
    }

    @Override
    void buildSymbol() {
        token.setSymbol("TKN");
    }

    @Override
    void buildTypeToken() {
        token.setTypeToken(TypeToken.ERC20);
    }

    @Override
    void buildSupply() {
        token.setSupply(1000);
    }
}
