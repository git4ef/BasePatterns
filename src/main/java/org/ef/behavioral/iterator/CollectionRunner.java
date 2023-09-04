package org.ef.behavioral.iterator;

public class CollectionRunner {
    public static void main(String[] args) {
        String[] nft = {"Rare nft#1", "Uncommon nft#2", "Common nft#3", "Rare nft#4"};

        BlocksNFTCollection blocksNFTCollection = new BlocksNFTCollection("somebody", nft);

        Iterator iterator = blocksNFTCollection.getIterator();
        System.out.println("Author: " + blocksNFTCollection.getAuthor());
        System.out.println("NFT: ");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
