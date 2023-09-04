package org.ef.behavioral.visitor;

public interface Visitor {
    public void swap(Swap swap);
    public void bridge(Bridge bridge);
    public void vote(Governance governance);
}
