package org.ef.behavioral.chain;

public class CommonPriceHandler extends PriceHandler {

    public CommonPriceHandler(int rarity) {
        super(rarity);
    }

    @Override
    public void buyNFT(String nft) {
        System.out.println("*Buy Common NFT: " + nft);
    }
}
