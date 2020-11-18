package ch04.Exercises.e19;
/*4.19 (Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item    Value
1       239.99
2       129.75
3       99.95
4       350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/

import java.util.Scanner;

public class SalesCommissionCalculator 
{
    
   private double item1Price = 239.99;
   private double item2Price = 129.75;
   private double item3Price = 99.95;
   private double item4Price = 350.89;
   private double grossEarnings;


   public SalesCommissionCalculator()
   {

   }

   // method to compute sales person earnings.
   public void computeEarnings()
   {
       Scanner input = new Scanner(System.in); // calling Scanner class

       /*  prompt the user to input how many of items 1 sold
           value of item 1 sold = item1 * number of item 1 sold*/
       System.out.print("Please enter the number of item1 sold: ");
       int item1QtySold = input.nextInt();
       double item1Earnings = item1QtySold * item1Price;

       System.out.print("Please enter the number of item2 sold: ");
       int item2QtySold = input.nextInt();
       double item2Earnings = item2QtySold * item2Price;

       System.out.print("Please enter the number of item3 sold: ");
       int item3QtySold = input.nextInt();
       double item3Earnings = item3QtySold * item3Price;

       System.out.print("Please enter the number of item4 sold: ");
       int item4QtySold = input.nextInt();
       double item4Earnings = item4QtySold * item4Price;

       // GrossEarnings is equal to earnings on each item sold
       grossEarnings = item1Earnings + item2Earnings + item3Earnings + item4Earnings;

       /* earnings = $200 + ( 9% of gross sales )*/
       double salesManEarnings = 200 + (0.09 * grossEarnings);

       System.out.println("Based on the number of items you sold\n" +
               "Your total earning is: " + "$" +(int)salesManEarnings);
   }
}
