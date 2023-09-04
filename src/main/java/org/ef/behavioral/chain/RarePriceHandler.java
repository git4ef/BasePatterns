package org.ef.behavioral.chain;

public class RarePriceHandler extends PriceHandler {
    public RarePriceHandler(int rarity) {
        super(rarity);
    }

    @Override
    public void buyNFT(String nft) {
        System.out.println("*Buy Rare nft: "+nft);
    }
}
