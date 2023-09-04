package org.ef.behavioral.visitor;

public class DEXRunner {
    public static void main(String[] args) {
        SomeDEX someDEX = new SomeDEX();
        SomeVisitor someVisitor = new SomeVisitor();

        System.out.println("\nVisitor in Action..\n");
        someDEX.doWork(someVisitor);

    }
}
