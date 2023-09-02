package org.ef.structural.adapter;

public class WalletRunner {
    public static void main(String[] args) {
        WalletApplication walletApplication = new AdapterRestorerWalletByJson();

        walletApplication.restoreWalletByJson();
    }
}
