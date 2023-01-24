package pl.dolega;


import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    Calculator calculator = new Calculator();
    BigInteger a = BigInteger.valueOf(3);
    BigInteger b = BigInteger.valueOf(2);

    @Test
    public void testAddition() {
        BigInteger result = calculator.addition(a, b);
        assertEquals(BigInteger.valueOf(5), result);
    }

    @Test
    public void testSubtraction() {
        BigInteger result = calculator.subtraction(a, b);
        assertEquals(BigInteger.valueOf(1), result);
    }

    @Test
    public void testMultiplication() {
        BigInteger result = calculator.multiplication(a, b);
        assertEquals(BigInteger.valueOf(6), result);
    }

    @Test
    public void testDivision() {
        BigDecimal result = calculator.division(a, b);
        assertEquals(BigDecimal.valueOf(1.5), result);
    }

}
