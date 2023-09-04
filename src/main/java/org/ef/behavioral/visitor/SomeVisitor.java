package org.ef.behavioral.visitor;

public class SomeVisitor implements Visitor {
    @Override
    public void swap(Swap swap) {
        System.out.println("token1 swapped to token2");
    }

    @Override
    public void bridge(Bridge bridge) {
        System.out.println("token bridged from network1 to network2");
    }

    @Override
    public void vote(Governance governance) {
        System.out.println("voting YES from proposal 123");
    }
}
