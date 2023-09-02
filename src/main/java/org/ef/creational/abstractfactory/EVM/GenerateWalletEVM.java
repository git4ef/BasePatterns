package org.ef.creational.abstractfactory.EVM;

import org.ef.creational.abstractfactory.Generator;

public class GenerateWalletEVM implements Generator {
    @Override
    public void createAddress() {
        System.out.println("generate EVM address");
    }
}
