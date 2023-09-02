package org.ef.structural.bridge;

public class VotingCoin extends ContractToken{
    protected VotingCoin(TokenType tokenType) {
        super(tokenType);
    }

    @Override
    public void deployToken() {
        System.out.println("Deploy voting tokens");
        tokenType.getTypeToken();
    }
}
