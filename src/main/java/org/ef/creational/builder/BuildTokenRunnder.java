package org.ef.creational.builder;

public class BuildTokenRunnder {
    public static void main(String[] args) {
        Deployer deployer = new Deployer();

        deployer.setTokenBuilder(new ERC721TokenBuilder());
        Token token = deployer.buildToken();

        System.out.println(token);
    }


}
