package org.ef.behavioral.command;

public class HoldCommand implements Command{
    Collection collection;

    public HoldCommand(Collection collection) {
        this.collection = collection;
    }

    @Override
    public void execute() {
        collection.hold();
    }
}
