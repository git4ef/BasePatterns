package org.ef.structural.facade;

public class Transfer {
    private boolean transferComplete;

    public boolean isActiveTransfer() {
        return transferComplete;
    }

    public void startTransfer(){
        System.out.println("Transfer is pending.");
        transferComplete = true;
    }

    public void finishTransfer(){
        System.out.println("Transfer is success.");
        transferComplete = false;
    }
}
