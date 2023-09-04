package org.ef.behavioral.chain;

public class UncommonPriceHandler extends PriceHandler {


    public UncommonPriceHandler(int rarity) {
        super(rarity);
    }

    @Override
    public void buyNFT(String nft) {
        System.out.println("*Buy Uncommon nft: " + nft);
    }
}
