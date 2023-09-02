package org.ef.structural.facade;

public class DApp {
    public void setTransfer(Transfer transfer) {
        if (transfer.isActiveTransfer()){
            System.out.println("Transfer is pending.");
        } else {
            System.out.println("Waiting to make transfer.");
        }
    }
}
