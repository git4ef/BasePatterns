package org.ef.creational.abstractfactory;

import org.ef.creational.abstractfactory.EVM.EVMWalletFactory;

public class TestnetEVMGoerli {
    public static void main(String[] args) {
        WalletFactory walletFactory = new EVMWalletFactory();
        Generator generator = walletFactory.getGenerator();
        Saver saver = walletFactory.getSaver();
        Checker checker = walletFactory.getChecker();

        System.out.println("Creating EVM wallet");
        generator.createAddress();
        saver.saveAddress();
        checker.checkBalance();
    }
}
