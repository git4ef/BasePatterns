package org.ef.behavioral.command;

public class CollectionRunner {
    public static void main(String[] args) {
        Collection collection = new Collection();
        Operator operator = new Operator(new BuyCommand(collection),
                new SellCommand(collection),
                new HoldCommand(collection));

        operator.buyNFT();
        operator.sellNFT();
        operator.holdNFT();
    }
}
