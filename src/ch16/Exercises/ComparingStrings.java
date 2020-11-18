package ch16.Exercises;
//16.3 (Comparing Strings) Write an application that uses String method compareTo to compare
//two strings input by the user. Output whether the first string is less than, equal to or greater than
//the second

import java.util.Scanner;

public class ComparingStrings
{
    public static void main (String[]args)
    {
        Scanner userInput = new Scanner (System.in);

        System.out.print("Enter the first String: "); // user prompt
        String reply1 = userInput.nextLine(); // save user input

        System.out.print("Enter the second string:"); // user prompt
        String reply2 = userInput.nextLine(); // save user input

        int output = reply1.compareTo(reply2); // calling static String method compareTo

        //Method compareTo returns 0 if the Strings are equal,
        // returns a negative number if the String that invokes compareTo is less than the String that’s passed as an
        //argument and a positive number if the String that invokes compareTo is greater than the String that's passed
        // as an argument
        System.out.println("Comparing user inputs 1 and user input 2: "  +output);

       if (output == 0) /// if strings are equal print
       {
           System.out.println("The strings inputted are equal");
       } else if (output < 0) // if  output is negative print
       {
           System.out.println("The first string is less than the second string.");
       } else
           { // if output is positive print
               System.out.println("The first string is greater than the second string");
           }
    }
}
