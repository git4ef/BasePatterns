package org.ef.creational.abstractfactory.Cosmos;

import org.ef.creational.abstractfactory.Checker;
import org.ef.creational.abstractfactory.Generator;
import org.ef.creational.abstractfactory.Saver;
import org.ef.creational.abstractfactory.WalletFactory;

public class CosmosWalletFactory implements WalletFactory {
    @Override
    public Generator getGenerator() {
        return new GeneratorAddressCosmos();
    }

    @Override
    public Saver getSaver() {
        return new SaverWalletCosmos();
    }

    @Override
    public Checker getChecker() {
        return new CheckerWalletCosmos();
    }
}
