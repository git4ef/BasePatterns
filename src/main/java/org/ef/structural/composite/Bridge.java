package org.ef.structural.composite;

public class Bridge implements Section{
    @Override
    public void startWorking() {
        System.out.println("Bridge is available");
    }
}
