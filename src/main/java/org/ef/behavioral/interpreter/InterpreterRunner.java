package org.ef.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        getGweiToEthExpression().interpret(12352346L);
    }

    public static Expression getGweiToEthExpression(){
        return new GweiToETHExpression();
    }
}
