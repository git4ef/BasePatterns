package org.ef.behavioral.visitor;

public class Bridge implements DAppElement{
    @Override
    public void doWork(Visitor visitor) {
        visitor.bridge(this);
    }
}
