package ch02exercises;
/*
* Write an application that asks the user to enter two integers, obtains them from the user and
*  prints their sum, product, difference and quotient(division).  Chapter 2.15
* */
import java.util.Scanner;
public class Arithmetic {
    // main class
    public static void main (String[]args){

        // Create a Scanner class
        Scanner input = new Scanner(System.in);

        int firstNumber; // first Integer
        int secondNumber; // second Integer


        System.out.print("Enter the first integer:"); // user prompt
        firstNumber = input.nextInt();

        System.out.print("Enter the second Integer:"); // user prompt
        secondNumber = input.nextInt();

        int difference = firstNumber - secondNumber; // difference
        int sum = firstNumber + secondNumber; // sum

        // Outputs
        System.out.println("The sum is:"  + sum);
        System.out.println("The product is : " + firstNumber * secondNumber);
        System.out.println("The difference is : " + difference);
        System.out.println("Their quotient is : " + firstNumber % secondNumber);
    } // end main method
} //  end Arithmetic class
