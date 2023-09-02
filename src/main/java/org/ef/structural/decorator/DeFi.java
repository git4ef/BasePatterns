package org.ef.structural.decorator;

public class DeFi {
    public static void main(String[] args) {
        Section swap = new CrossChainSwap(new Swap());

        System.out.println(swap.makeTask());
    }
}
