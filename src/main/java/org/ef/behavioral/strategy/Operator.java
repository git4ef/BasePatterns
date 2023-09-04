package org.ef.behavioral.strategy;

public class Operator {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void executeAction(Token token) {
        action.doAction();
    }
}
