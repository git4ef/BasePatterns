package org.ef.creational.singleton;

public class NetworkSelector {
    private static NetworkSelector networkSelector;

    public static synchronized NetworkSelector getNetworkSelector() {
        if (networkSelector == null) {
            networkSelector = new NetworkSelector();
        }
        return networkSelector;
    }

    public String getMainnetRPC() {
        return "Mainnet: https://rpc.ankr.com/eth";
    }

    public String getArbitrumRPC() {
        return "Arbitrum: https://arbitrum-one.publicnode.com";
    }
}
