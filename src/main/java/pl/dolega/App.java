package pl.dolega;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Calculator calculator = new Calculator();

        BigInteger a = BigInteger.valueOf(3);
        BigInteger b = BigInteger.valueOf(2);

        System.out.println(calculator.addition(a, b));
        System.out.println(calculator.substraction(a, b));
        System.out.println(calculator.multiplication(a, b));
        System.out.println(calculator.division(a, b));

    }
}
