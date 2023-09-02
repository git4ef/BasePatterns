package org.ef.structural.bridge;

public class DeployerToken {
    public static void main(String[] args) {
        ContractToken contractToken = new MemeCoin(new ERC20TypeToken());
        contractToken.deployToken();

        System.out.println("\n=============================================\n");

        ContractToken contractToken2 = new MemeCoin(new ERC1155TypeToken());
        contractToken2.deployToken();

        System.out.println("\n=============================================\n");

        ContractToken contractToken3 = new VotingCoin(new ERC1155TypeToken());
        contractToken3.deployToken();
    }
}
