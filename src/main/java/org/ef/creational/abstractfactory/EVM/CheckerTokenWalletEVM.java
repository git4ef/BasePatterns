package org.ef.creational.abstractfactory.EVM;

import org.ef.creational.abstractfactory.Checker;

public class CheckerTokenWalletEVM implements Checker {
    @Override
    public void checkBalance() {
        System.out.println("check tokens by address EVM");
    }
}
