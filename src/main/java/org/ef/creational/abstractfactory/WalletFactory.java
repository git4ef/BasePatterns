package org.ef.creational.abstractfactory;

public interface WalletFactory {
    Generator getGenerator();
    Saver getSaver();
    Checker getChecker();
}
