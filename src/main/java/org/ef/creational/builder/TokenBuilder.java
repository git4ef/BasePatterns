package org.ef.creational.builder;

public abstract class TokenBuilder {
    Token token;

    void createToken() {
        token = new Token();
    }

    abstract void buildName();

    abstract void buildSymbol();

    abstract void buildTypeToken();

    abstract void buildSupply();

    Token getToken() {
        return token;
    }
}