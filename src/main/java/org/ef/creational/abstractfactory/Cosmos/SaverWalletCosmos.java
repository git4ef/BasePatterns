package org.ef.creational.abstractfactory.Cosmos;

import org.ef.creational.abstractfactory.Saver;

public class SaverWalletCosmos implements Saver {
    @Override
    public void saveAddress() {
        System.out.println("mnemonic cosmos wallet save to file");
    }
}
