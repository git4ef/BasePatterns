package org.ef.behavioral.visitor;

public class Swap implements DAppElement{
    @Override
    public void doWork(Visitor visitor) {
        visitor.swap(this);
    }
}
