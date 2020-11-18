package ch16.Exercises;

import java.util.Scanner;

//16.10 (Displaying Strings in Uppercase and Lowercase) Write an application that inputs a line of
//text and outputs the text twice—once in all uppercase letters and once in all lowercase letters.
public class UpperAndLowerCaseConverter
{
    static String userInput;

    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        userInput = scanner.nextLine();

        System.out.println("To upper case: " +tUpperCase(userInput)); // calling method tUpperCase
        System.out.println("To lower case:"  +tLowerCase(userInput)); // calling method tLowerCase

        // or alternatively i can just call the static String classes here.

        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
    }

    // convert user input to uppercase
    public static String tUpperCase(String str)
    {
        userInput =str.toUpperCase(); // call String method toUppercase

        return userInput; // return userInput as uppercase
    }

    // convert user input to lowercase
    public static String tLowerCase(String str)
    {
        userInput =str.toLowerCase(); // call String method toLowerCase

        return userInput; // return userInput as lowercase
    }
}
