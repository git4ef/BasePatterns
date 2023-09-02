package org.ef.creational.factorymethod;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.http.HttpService;
import org.web3j.utils.Convert;
import java.io.IOException;

public class OptimismBalanceChecker implements BalanceChecker<String> {
    private final Web3j client = Web3j.build(new HttpService("https://optimism-mainnet.public.blastapi.io"));

    @Override
    public void getBalance(String address) {
        EthGetBalance balanceResponse;
        try {
            balanceResponse = client.ethGetBalance(address, DefaultBlockParameterName.PENDING).send();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String balanceEther = Convert.fromWei(balanceResponse.getBalance().toString(), Convert.Unit.ETHER).toPlainString();
        System.out.println("Optimism network. Balance ETH: " + balanceEther);
    }
}

