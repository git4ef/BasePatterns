package org.ef.creational.builder;

public class Deployer {
    TokenBuilder tokenBuilder;

    public void setTokenBuilder(TokenBuilder tokenBuilder) {
        this.tokenBuilder = tokenBuilder;
    }

    Token buildToken(){
        tokenBuilder.createToken();
        tokenBuilder.buildName();
        tokenBuilder.buildSymbol();
        tokenBuilder.buildTypeToken();
        tokenBuilder.buildSupply();

        Token token = tokenBuilder.getToken();
        return token;
    }
}
