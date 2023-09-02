package org.ef.creational.abstractfactory.Cosmos;

import org.ef.creational.abstractfactory.Checker;

public class CheckerWalletCosmos implements Checker {
    @Override
    public void checkBalance() {
        System.out.println("check cosmos address balance");
    }
}
