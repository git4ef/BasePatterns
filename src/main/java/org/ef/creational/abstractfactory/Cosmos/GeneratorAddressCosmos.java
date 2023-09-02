package org.ef.creational.abstractfactory.Cosmos;

import org.ef.creational.abstractfactory.Generator;

public class GeneratorAddressCosmos implements Generator {
    @Override
    public void createAddress() {
        System.out.println("generate cosmos address");
    }
}
