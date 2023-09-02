package org.ef.creational.prototype;

public class Wallet implements Copyable{
    private String address;
    private String mnemonicPhrase;
    private Network network;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMnemonicPhrase() {
        return mnemonicPhrase;
    }

    public void setMnemonicPhrase(String mnemonicPhrase) {
        this.mnemonicPhrase = mnemonicPhrase;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Wallet(String generate, String mnemonicPhrase, Network network) {
        this.address = generate;
        this.mnemonicPhrase = mnemonicPhrase;
        this.network = network;
    }

    @Override
    public Object copy() {
        Wallet copyWallet = new Wallet(address,mnemonicPhrase,network);
        return copyWallet;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "address='" + address + '\'' +
                ", mnemonicPhrase='" + mnemonicPhrase + '\'' +
                ", network=" + network +
                '}';
    }
}
