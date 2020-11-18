package ch05.Exercises;
/*5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
of the odd integers from 1 to 15.*/
public class ProductOddIntegers
{
    public static void main (String[]args)
    {
        int i = 1;
        int product = 1;
        for (i = 1; i<=15; i+=2)
        {
             product *= i;
             System.out.println(product);
             System.out.println();
        }


    }
}
