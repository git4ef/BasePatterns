package org.ef.behavioral.chain;

import static org.ef.behavioral.chain.Rarity.RARE;

public abstract class PriceHandler {
    private int rarity;
    private PriceHandler nextPriceHandler;

    public PriceHandler(int rarity) {
        this.rarity = rarity;
    }

    public void setNextPriceHandler(PriceHandler nextPriceHandler) {
        this.nextPriceHandler = nextPriceHandler;
    }

    public void actionHandler(String nft, int level) {
        if (level >= rarity) {
            buyNFT(nft);
        }
        if (nextPriceHandler != null) {
            nextPriceHandler.actionHandler(nft, level);
        }
    }

    public abstract void buyNFT(String nft);
}
