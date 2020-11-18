package ch16.Exercises;

import java.util.Scanner;

//16.4 (Comparing Portions of Strings) Write an application that uses String method region-Matches
// to compare two strings input by the user. The application should input the number of characters
//to be compared and the starting index of the comparison. The application should state
//whether the strings are equal. Ignore the case of the characters when performing the comparison.
public class ComparingPortionsOfStrings
{
    public static void main (String[]args)
    {
        Scanner userInput = new Scanner (System.in); /// calling Scanner class

        System.out.print("Enter the first String: "); // user prompt
        String reply1 = userInput.nextLine(); // save user input

        System.out.print("Enter the second string:"); // user prompt
        String reply2 = userInput.nextLine(); // save user input

        /// This checks if the substring of both Strings to be compared match while ignoring the casing
        /*
        * @param    true  : means to ignore the case
        * @param    toffset: represents the starting index of the first String
        * @param    @NotNullStringother: represents the second String to be compared which must not be null
        * @param    ooffset: means the starting index of the second String object to be compared
        * @param    len:    means the length of what is to compared
        * */
        if (reply1.regionMatches(true,0,reply2,0,6))
                    System.out.println("The first 6 characters of both inputs match");
         else
                    System.out.println("The first 6 characters of both inputs do not match");
    } // end main method
}// end class ComparingPortionsOfStrings
