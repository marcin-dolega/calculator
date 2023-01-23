package pl.dolega;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Calculator calculator = new Calculator();

        calculator.addition(3, 2);
        calculator.substraction(3, 2);
        calculator.multiplication(3, 2);
        System.out.println(calculator.division(3, 2));

    }
}
