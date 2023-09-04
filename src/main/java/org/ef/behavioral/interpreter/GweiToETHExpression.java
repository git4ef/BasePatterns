package org.ef.behavioral.interpreter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GweiToETHExpression implements Expression <Long>{

    @Override
    public void interpret(Long l) {
    BigDecimal d = new BigDecimal(l)
            .divide(new BigDecimal(1000000000L),9,RoundingMode.HALF_UP);
        System.out.println("ETH: " + d);
    }
}
