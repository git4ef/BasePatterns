package org.ef.creational.builder;

public class ERC721TokenBuilder extends TokenBuilder{
    @Override
    void buildName() {
        token.setName("nft collection");
    }

    @Override
    void buildSymbol() {
        token.setSymbol("nft");
    }

    @Override
    void buildTypeToken() {
        token.setTypeToken(TypeToken.ERC721);
    }

    @Override
    void buildSupply() {
        token.setSupply(10);
    }
}
