package ch02exercises;
/*
* Write an application that asks the user to enter two integers,obtains them from the user and displays
* the larger number followed by the words "is larger". IF the numbers are equal, print the message
* "These numbers are equal". */

import java.util.Scanner; // importing scanner class
public class ComparingIntegers {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in); // Create the scanner class

        System.out.print("Enter first integer:");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter second integer:");
        int secondInteger = scanner.nextInt();

        // comparing values
        if(firstInteger > secondInteger){
            System.out.println(firstInteger + " Is larger");
        } else if ( secondInteger > firstInteger){
            System.out.println(secondInteger + " is larger");
        } else if (firstInteger == secondInteger){
            System.out.println("These numbers are equal");
        }
    }
}
