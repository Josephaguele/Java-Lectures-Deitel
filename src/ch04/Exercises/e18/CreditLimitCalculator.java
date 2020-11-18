package ch04.Exercises.e18;/* Exercise 4.18 (Credit Limit Calculator)
 Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
the message "Credit limit exceeded".*/

import java.util.Scanner;

public class CreditLimitCalculator 
{
    
    private double accNo; // account number
    private double beginningBal; // balance at beginning of the month
    private double totalcharges; // total of all items charged by the customer this month
    private double totalCredits; // total of all credits applied to the customer's account this month
    private double allowedCreditLimit; // allowed credit limit

    // constructor
    public CreditLimitCalculator()
    {

    }

    // calculation
    public void calculation()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Account Number: "); // USER PROMPT
        accNo = scanner.nextDouble();
        
        System.out.print("Enter balance at the beginning of the month: ");
        beginningBal = scanner.nextDouble();
        
        System.out.print("Enter total of all items charged by the customer this month: ");
        totalcharges = scanner.nextDouble();
        
        System.out.print("Enter total credits applied to your customer account this month: ");
        totalCredits = scanner.nextDouble();
        
        System.out.print("Enter your company's allowed credit limit:  ");
        allowedCreditLimit = scanner.nextDouble();

        double newBalance =
                beginningBal + totalcharges - totalCredits;
        System.out.println("Your new balance is : " + newBalance);

        if ( newBalance > allowedCreditLimit)
        {
            System.out.println("Credit Limit exceeded.");
        }

    } // end method calculation
} // end class CreditLimitCalculator
