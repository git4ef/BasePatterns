package org.ef.structural.bridge;

public class ERC1155TypeToken implements TokenType{
    @Override
    public void getTypeToken() {
        System.out.println("Token type ERC1155");
    }
}
