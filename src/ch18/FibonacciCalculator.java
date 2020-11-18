package ch18;// Fig. 18.5: FibonacciCalculator.java
// Recursive fibonacci method.
import java.math.BigInteger;

public class FibonacciCalculator
{


    // recursive declaration of method fibonacci
    public static BigInteger fibonacci (BigInteger number)
    {
        if (number.equals(BigInteger.ZERO) ||
        number.equals(BigInteger.ONE)) // base cases
            return number;
        else// recursion step
            return fibonacci(number.subtract(BigInteger.ONE)).add
                    (fibonacci(number.subtract(BigInteger.TWO)));
    } // end method fibonacci

    // displays the fibonacci values from 0 - 40
    public static void main (String[]args)
    {
        for (int counter = 0; counter <= 120; counter++)
            System.out.printf("Fibonacci of %d is: %d\n", counter,
                    fibonacci(BigInteger.valueOf(counter)));
    } // end main
} // end class FibonacciCalculator
