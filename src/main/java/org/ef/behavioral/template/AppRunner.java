package org.ef.behavioral.template;

public class AppRunner {
    public static void main(String[] args) {
        NFTTemplate templateERC721 = new ERC721();
        NFTTemplate templateERC1155 = new ERC1155();


        templateERC721.showNFT();

        System.out.println("\n=============================================\n");

        templateERC1155.showNFT();
    }
}
