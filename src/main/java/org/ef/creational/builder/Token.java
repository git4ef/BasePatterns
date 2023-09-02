package org.ef.creational.builder;

public class Token {
    private String name;
    private String symbol;
    private TypeToken typeToken;
    private int supply;

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setTypeToken(TypeToken typeToken) {
        this.typeToken = typeToken;
    }

    public void setSupply(int supply) {
        this.supply = supply;
    }

    @Override
    public String toString() {
        return "Token{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", typeToken=" + typeToken +
                ", supply=" + supply +
                '}';
    }
}
