package org.ef.structural.bridge;

public class ERC20TypeToken implements TokenType {
    @Override
    public void getTypeToken() {
        System.out.println("Token type ERC20");
    }
}
