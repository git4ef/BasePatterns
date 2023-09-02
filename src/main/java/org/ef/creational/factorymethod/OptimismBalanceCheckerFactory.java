package org.ef.creational.factorymethod;

public class OptimismBalanceCheckerFactory implements BalanceCheckerFactory{
    @Override
    public BalanceChecker createBalanceChecker() {
        return new OptimismBalanceChecker();
    }
}
