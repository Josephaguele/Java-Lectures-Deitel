package ch06.exercises;

import java.util.Scanner;

/*6.8 (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
longer than 24 hours at a time.
Write an application that calculates and displays the parking charges for each customer who parked in the
garage yesterday. You should enter the hours parked for each customer. The program should display the
charge for the current customer and should calculate and display the running total of yesterday’s receipts.
It should use the method calculateCharges to determine the charge for each customer.*/
public class ParkingCharges {

    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of hours in which you had your vehicle parked:");
        double hoursParked = input.nextDouble();


        System.out.println("Your parking charge is : $" + calculateCharges(hoursParked));
    }

    // calculates the parking charges
    public static double calculateCharges(double hours)
    {
        double charges = 0;
        double extraHours = hours - 3;

        if (hours <= 3)
        charges = 2;
        else if ((hours > 3) && (hours < 24))
            charges = 2 + (extraHours * 0.5);
        else if (hours == 24)
            charges = 10;
        else
            System.out.println("Hours parked cannot exceed a day.");
        return charges;
    }
}

//PSEUDOCODE
/*System prompt (Enter hours parked for each customer)
* double hoursParked = input.nextDouble
*
* calculateCharges(double hours)
*   double charges
*   double extrahours = hours - 3
*   if (hours ==3) charges = 2 dollars
*   else if ( hours > 3) && (hours < 24) charges = 2 + (extrahours * 0.5)
*   else if ( hours == 24) charges =  10 dollars
*   else print ("hours parked cannot be more than 24)
*   System print (Your parking charge is : calculateCharges(hoursParked))*/
