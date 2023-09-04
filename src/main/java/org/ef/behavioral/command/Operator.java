package org.ef.behavioral.command;

public class Operator {
    Command buy;
    Command sell;
    Command hold;

    public Operator(Command buy, Command sell, Command hold) {
        this.buy = buy;
        this.sell = sell;
        this.hold = hold;
    }

    public void buyNFT(){
        buy.execute();
    }

    public void sellNFT(){
        sell.execute();
    }

    public void holdNFT(){
        hold.execute();
    }
}
