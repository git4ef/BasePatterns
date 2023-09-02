package org.ef.creational.abstractfactory.EVM;

import org.ef.creational.abstractfactory.Checker;
import org.ef.creational.abstractfactory.Generator;
import org.ef.creational.abstractfactory.Saver;
import org.ef.creational.abstractfactory.WalletFactory;

public class EVMWalletFactory implements WalletFactory {
    @Override
    public Generator getGenerator() {
        return new GenerateWalletEVM();
    }

    @Override
    public Saver getSaver() {
        return new SaverWalletEVM();
    }

    @Override
    public Checker getChecker() {
        return new CheckerTokenWalletEVM();
    }
}
