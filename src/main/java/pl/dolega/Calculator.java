package pl.dolega;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Calculator {

    public BigInteger addition(BigInteger a, BigInteger b) {
        return a.add(b);
    }

    public BigInteger subtraction(BigInteger a, BigInteger b) {
        return a.subtract(b);
    }

    public BigInteger multiplication(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }

    public BigDecimal division(BigInteger a, BigInteger b) {
        return new BigDecimal(a).divide(new BigDecimal(b));
    }
}
