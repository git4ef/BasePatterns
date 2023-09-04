package org.ef.behavioral.visitor;

public class SomeDEX implements DAppElement{
    DAppElement[] dAppElements;


    public SomeDEX() {
        this.dAppElements =  new DAppElement[]{
                new Swap(),
                new Bridge(),
                new Governance()
        };
    }

    @Override
    public void doWork(Visitor visitor) {
        for (DAppElement dappElement:dAppElements) {
            dappElement.doWork(visitor);
        }
    }
}
