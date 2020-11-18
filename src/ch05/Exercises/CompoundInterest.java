package ch05.Exercises;// Fig 5.6 Interest.java
// Compound-interest calculations with for.
/*A person invests $1000 in a savings account yielding 5% interest. Assuming that all the
interest is left on deposit, calculate and print the amount of money in the account at the
end of each year for 10 years. Use the following formula to determine the amounts:
a = p (1 + r)^n
where
p is the original amount invested (i.e., the principal)
r is the annual interest rate (e.g., use 0.05 for 5%)
n is the number of years
a is the amount on deposit at the end of the nth year.
The solution to this problem (Fig. 5.6) involves a loop that*/


/*5.14 (Modified Compound-Interest Program) Modify the compound-interest application of
Fig. 5.6 to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a for loop to
vary the interest rate.*/
public class CompoundInterest
{
    public static void main (String[]args)
    {
        double amount; // amount on deposit at end of each year
        double principal =  1000.0; // initial amount before interest
        double rate = 0.0; // interest rate

        // display headers
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");


        for (double r =5; r <= 10; r++){
            rate = r;
            System.out.printf("Rate at interest of %.2f%%\n", rate);
            // calculate amount on deposit for each of ten years
            for (int year = 1; year <= 10; year++)
            {
                // calculate new amount for specified year
                amount = principal * Math.pow(1.0 +(rate/100), year);

                // display the year and the amount
                System.out.printf("%4d%,20.2f\n", year, amount);


            } // end for
        }

    } // end main
}// end class Interest
