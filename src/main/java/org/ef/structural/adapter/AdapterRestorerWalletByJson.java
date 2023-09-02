package org.ef.structural.adapter;

public class AdapterRestorerWalletByJson extends WalletApplication implements RestorerWallet {
    @Override
    public void restoreWallet() {
        restoreWalletByJson();
    }
}
