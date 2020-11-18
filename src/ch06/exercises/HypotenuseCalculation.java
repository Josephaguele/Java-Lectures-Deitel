package ch06.exercises;

import java.util.Scanner;

public class HypotenuseCalculation {

    private static double side1; // side one
    private static double side2; // side two
    private static double hypotenuse;

    public static void main (String[]args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the triangle: ");
        side1 = userInput.nextDouble();

        System.out.print("Enter the length of the second side of the triangle: ");
        side2 = userInput.nextDouble();

       System.out.println("The hypotenuse of the triangle with the sides you entered is: "
               + calculateHypotenuse(side1,side2));
    }

    static double calculateHypotenuse(double s1, double s2){
        hypotenuse = Math.sqrt(Math.pow(s1,2)+Math.pow(s2,2));
        return hypotenuse;
    }
}
