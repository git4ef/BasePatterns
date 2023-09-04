package org.ef.behavioral.state;

public class AppRunner {
    public static void main(String[] args) throws InterruptedException {
        Token token = new Token(5);
        Action action = new Holding();

        Operator operator = new Operator();
        operator.setAction(action);
        operator.doAction();

        token.setPrice(9);
        operator.changeAction(token);
        operator.doAction();

        token.setPrice(2);
        operator.changeAction(token);
        operator.doAction();
    }
}
