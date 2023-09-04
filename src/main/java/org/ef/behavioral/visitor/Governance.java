package org.ef.behavioral.visitor;

public class Governance implements DAppElement{
    @Override
    public void doWork(Visitor visitor) {
        visitor.vote(this);
    }
}
