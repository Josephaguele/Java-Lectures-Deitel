package ch02exercises;
import java.util.Scanner;

/*
* Create a BMI Calculator that reads the user's weight in pounds and height in inches ( or, if you prefer,
* the user's weight in kilograms and height in meters), then calculates and displays the user's body mass
* index. Also, display the following information from the Department of Health and Human Services/National
* Institutes of Health so the user can evaluate his/her BMI.
*
* BMI = weightInKilograms/ heightInmETERS X heightInMeters
*
* */
public class BMICalculator {
    public static void main (String[]args){

        // Calling scanner Class using the new Keyword to read characters typed by the user at the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in Kilograms:"); // prompt user to input weight
        double weight = scanner.nextDouble();

        System.out.print("Enter your height In Meters:"); // prompt user to input height
        double height = scanner.nextDouble();

        double BMI = weight/ (height * height);

        System.out.println("Your BMI is :" + BMI);
        System.out.println("BMI Values\nUnderweight :\t less than 18.5\nNormal:\t between 18.5 and 24.9");
        System.out.println("Overweight:\t between 25 and 29.9");
        System.out.println("Obese:\t 30 or greater");

    } // end main method

} // end class BMICalculator
