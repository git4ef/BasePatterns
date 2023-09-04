package org.ef.behavioral.strategy;


public class AppRunner {
    public static void main(String[] args) throws InterruptedException {
        Operator operator = new Operator();
        Token token = new Token(5);

        operator.setAction(new Holding());
        operator.executeAction(token);

        token.setPrice(8);
        operator.setAction(new Selling());
        operator.executeAction(token);

        token.setPrice(2);
        operator.setAction(new Buying());
        operator.executeAction(token);

    }
}
