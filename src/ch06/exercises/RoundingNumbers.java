package ch06.exercises;

import java.util.Scanner;

/*6.9 (Rounding Numbers) Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor( x + 0.5 );
will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.*/
public class RoundingNumbers {

    private static double firstNo; // number to be inputted by user
    private static double secondNo; // number to be inputted by user

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
         firstNo = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
         secondNo = sc.nextDouble();

         rounder(); // calling rounder method
    }

    static void rounder(){
        int y1 = (int) Math.floor(firstNo + 0.5);
        int y2 = (int) Math.floor(secondNo + 0.5);

        System.out.println("The numbers inputted are: \t\t" + firstNo + "," + secondNo);
        System.out.println("Rounding to the nearest integer : " + y1 + "," + y2);

    }
}

/*PSEUDOCODE
* Receives double values
* Rounds off to the nearest integer
* Output should be received integers that have been rounded off
*
* Scanner input  = new Scanner (System.in)
* Prompt: Enter 1st number
* Prompt: Enter 2nd number
*
* 1stnumber = input.nextDouble
* 2ndnumber = input.nextDouble
*
* static void rounder(double n1, double n2)
* int y1 = Math.floor (n1 + 0.5)
* int y2 = Math.floor (n2 + 0.5)
* System print(1stnumber, 2ndnumber)
* System print("y1" and "y2") */
