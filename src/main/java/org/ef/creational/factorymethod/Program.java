package org.ef.creational.factorymethod;


public class Program {
    public static void main(String[] args) {
        String addressEVM = "0xab5801a7d398351b8be11c439e05c5b3259aec9b";

        BalanceCheckerFactory balanceCheckerFactory = createCheckerByNetwork("sepolia");
        BalanceChecker balanceChecker = balanceCheckerFactory.createBalanceChecker();

        balanceChecker.getBalance(addressEVM);
    }

    static BalanceCheckerFactory createCheckerByNetwork(String network) {
        if (network.equalsIgnoreCase("Arbitrum")) {
            return new ArbitrumBalanceCheckerFactory();
        } else if (network.equalsIgnoreCase("Optimism")) {
            return new OptimismBalanceCheckerFactory();
        } else if (network.equalsIgnoreCase("Sepolia")) {
            return new SepoliaBalanceCheckerFactory();
        } else
            throw new RuntimeException(network + " is unknown network.");
    }
}

