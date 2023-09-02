package org.ef.structural.decorator;

public class Swap implements Section {
    @Override
    public String makeTask() {
        return "Swap started";
    }
}
