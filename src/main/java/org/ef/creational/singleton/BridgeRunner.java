package org.ef.creational.singleton;

public class BridgeRunner {
    public static void main(String[] args) {
        System.out.println("-Bridge eth-");
        System.out.println(NetworkSelector.getNetworkSelector().getMainnetRPC());
        System.out.println("to");
        System.out.println(NetworkSelector.getNetworkSelector().getArbitrumRPC());

        System.out.println(NetworkSelector.getNetworkSelector().toString());
        System.out.println(NetworkSelector.getNetworkSelector().toString());
        System.out.println(NetworkSelector.getNetworkSelector().toString());
        System.out.println(NetworkSelector.getNetworkSelector().toString());
        System.out.println(NetworkSelector.getNetworkSelector().toString());
    }
}
