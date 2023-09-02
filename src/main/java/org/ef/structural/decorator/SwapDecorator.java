package org.ef.structural.decorator;

public class SwapDecorator implements Section{

    Section section;

    public SwapDecorator(Section section) {
        this.section = section;
    }

    @Override
    public String makeTask() {
        return section.makeTask();
    }
}
