package org.ef.structural.composite;

public class DApp {
    public static void main(String[] args) {
        DeFi defi = new DeFi();

        Section swap = new Swap();
        Section bridge = new Bridge();
        Section pool = new Pool();

        defi.addSection(swap);
        defi.addSection(bridge);
        defi.addSection(pool);

        defi.startWorking();
    }
}
