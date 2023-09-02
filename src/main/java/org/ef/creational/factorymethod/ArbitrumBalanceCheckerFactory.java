package org.ef.creational.factorymethod;

public class ArbitrumBalanceCheckerFactory implements BalanceCheckerFactory{
    @Override
    public BalanceChecker createBalanceChecker() {
        return new ArbitrumBalanceChecker();
    }
}
