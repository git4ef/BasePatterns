package org.ef.behavioral.chain;

public class PriceTracker {
    public static void main(String[] args) {
        PriceHandler uncommon = new CommonPriceHandler(Rarity.UNCOMMON);
        PriceHandler common = new UncommonPriceHandler(Rarity.COMMON);
        PriceHandler rare = new RarePriceHandler(Rarity.RARE);

        uncommon.setNextPriceHandler(common);
        common.setNextPriceHandler(rare);


        uncommon.actionHandler("Capy uncommon",Rarity.UNCOMMON);
        common.actionHandler("Bullshark common",Rarity.COMMON);
        rare.actionHandler("Jed rare",Rarity.RARE);
    }
}
