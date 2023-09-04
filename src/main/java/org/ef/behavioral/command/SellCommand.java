package org.ef.behavioral.command;

public class SellCommand implements Command{
    Collection collection;

    public SellCommand(Collection collection) {
        this.collection = collection;
    }

    @Override
    public void execute() {
        collection.sell();
    }
}
