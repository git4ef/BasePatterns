package org.ef.behavioral.command;

public class BuyCommand implements Command {
    Collection collection;

    public BuyCommand(Collection collection) {
        this.collection = collection;
    }

    @Override
    public void execute() {
        collection.buy();
    }
}
