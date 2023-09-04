package org.ef.behavioral.state;

public class Operator {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeAction(Token token) {
        if (token.getPrice() > 7) {
            setAction(new Selling());
        } else if (token.getPrice() < 3) {
            setAction(new Buying());
        } else if (token.getPrice() > 3 && token.getPrice() < 7) {
            setAction(new Holding());
        }
    }

    public void doAction() {
        action.doAction();
    }
}
