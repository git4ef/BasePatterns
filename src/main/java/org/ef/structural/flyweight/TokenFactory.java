package org.ef.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TokenFactory {
    private static Map<String, Token> portfolio = new HashMap<>();

    public Token getTokensByName(String tokenName){
        Token token = portfolio.get(tokenName);

        if(token == null){
            switch (tokenName) {
                case "safu":
                    System.out.println("SAFU token added to portfolio");
                    token = new SAFUToken();
                    break;
                case "lfg":
                    System.out.println("LFG token added to portfolio");
                    token = new LFGToken();
            }
            portfolio.put(tokenName,token);
        }
        return token;
    }
}
