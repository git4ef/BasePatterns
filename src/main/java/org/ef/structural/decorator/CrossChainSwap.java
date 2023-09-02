package org.ef.structural.decorator;

public class CrossChainSwap extends SwapDecorator {
    public CrossChainSwap(Section section) {
        super(section);
    }

    public String makeSwapBetweenChain() {
        return " between networks";
    }

    @Override
    public String makeTask() {
        return super.makeTask() + makeSwapBetweenChain();
    }
}
