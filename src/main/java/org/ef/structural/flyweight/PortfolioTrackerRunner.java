package org.ef.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTrackerRunner {
    public static void main(String[] args) {
        TokenFactory tokenFactory = new TokenFactory();

        List<Token> portfolio = new ArrayList<>();

        portfolio.add(tokenFactory.getTokensByName("lfg"));
        portfolio.add(tokenFactory.getTokensByName("safu"));

        for (Token token : portfolio) {
            token.AddTokenToPortfolio();
        }
    }
}
