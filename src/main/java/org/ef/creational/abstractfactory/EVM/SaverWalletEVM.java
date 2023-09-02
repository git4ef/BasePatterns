package org.ef.creational.abstractfactory.EVM;

import org.ef.creational.abstractfactory.Saver;

public class SaverWalletEVM implements Saver {
    @Override
    public void saveAddress() {
        System.out.println("mnemonic EVM wallet save to file");
    }
}
