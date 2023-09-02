package org.ef.creational.prototype;

public class GenerateWallet {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("generate wallet", "mnemonic from generate", Network.Solana);

        System.out.println(wallet);

        WalletFactory factory = new WalletFactory(wallet);
        Wallet walletClone = factory.cloneWallet();
        System.out.println(walletClone);
    }
}
