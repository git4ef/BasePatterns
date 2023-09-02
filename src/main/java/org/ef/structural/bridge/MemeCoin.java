package org.ef.structural.bridge;

public class MemeCoin extends ContractToken{
    protected MemeCoin(TokenType tokenType) {
        super(tokenType);
    }

    @Override
    public void deployToken() {
        System.out.println("Deploy meme coin");
        tokenType.getTypeToken();
    }
}
