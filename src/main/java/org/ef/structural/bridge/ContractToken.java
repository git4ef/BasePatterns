package org.ef.structural.bridge;

public abstract class ContractToken {

    protected TokenType tokenType;

    protected ContractToken(TokenType tokenType) {
        this.tokenType = tokenType;
    }


    public abstract void deployToken();
}
