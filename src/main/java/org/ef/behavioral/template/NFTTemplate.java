package org.ef.behavioral.template;

public abstract class NFTTemplate {
    public void showNFT(){
        System.out.println("Name");
        showNFTImage();
        System.out.println("Contract");
        System.out.println("Author");
    }

    public abstract void showNFTImage();
}
