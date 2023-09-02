package org.ef.structural.facade;

public class TransferFacade {
    Bridge bridge = new Bridge();
    DApp dApp = new DApp();
    Router router = new Router();
    Transfer transfer = new Transfer();

    public void makeTransfer(){
        transfer.startTransfer();
        router.wrapped();
        bridge.makeBridge();
        transfer.finishTransfer();
        dApp.setTransfer(transfer);
    }
}
