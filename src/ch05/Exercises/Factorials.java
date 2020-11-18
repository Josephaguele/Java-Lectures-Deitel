package ch05.Exercises;

/*5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
1 to n.Write an application that calculates the factorials of 1 through 20. Use type long. Display the
results in tabular format. What difficulty might prevent you from calculating the factorial of 100?*/
public class Factorials {
    public static void main(String[] args)
    {
        long factorial = 1l; // long is used since the values of factorials are large
        for (int i = 1; i <= 20; i++)
        {

            int temp = i;
            factorial = temp * factorial;
            System.out.println(i+ " factorial is: " + factorial);
        }

    }
}
