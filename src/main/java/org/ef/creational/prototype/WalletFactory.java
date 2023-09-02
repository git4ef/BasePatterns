package org.ef.creational.prototype;

public class WalletFactory {

    Wallet wallet;

    public WalletFactory(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    Wallet cloneWallet() {
        return (Wallet) wallet.copy();
    }
}
