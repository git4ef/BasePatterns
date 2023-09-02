package org.ef.creational.factorymethod;

public class SepoliaBalanceCheckerFactory implements BalanceCheckerFactory {
    @Override
    public BalanceChecker createBalanceChecker() {
        return new SepoliaBalanceChecker();
    }
}
