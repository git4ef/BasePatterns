package org.ef.creational.abstractfactory;

import org.ef.creational.abstractfactory.Cosmos.CosmosWalletFactory;

public class TestnetCosmosStride {
    public static void main(String[] args) {
        WalletFactory walletFactory = new CosmosWalletFactory();
        Generator generator = walletFactory.getGenerator();
        Saver saver = walletFactory.getSaver();
        Checker checker = walletFactory.getChecker();

        System.out.println("Creating cosmos wallet");
        generator.createAddress();
        saver.saveAddress();
        checker.checkBalance();
    }
}
