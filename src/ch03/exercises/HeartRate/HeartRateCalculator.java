package ch03.exercises.HeartRate;

import java.util.Calendar;
import java.util.Scanner;
public class HeartRateCalculator {
    private static int age;
    private static double maximumHeartRate;
    private int bYear;
    private double maxHeartRate;
    private static double targetHeartRate;



    public static void main(String[]args){

        HeartRates h = new HeartRates();
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your first name:");// user prompt
        String firstName = input.next(); // assigning information inputted by user.

        System.out.print("Enter your last name: "); // user prompt
        String lastName = input.next(); // assigning information inputted by user.

        System.out.print("Enter your birthDay in number:"); // user prompt
        int bDay = input.nextInt(); // assigning information inputted by user

        System.out.print("Enter your birth month numerically:"); // user prompt
        int bMonth = input.nextInt(); // assigning information inputted by user

        System.out.println("Enter your birth year numerically:"); // user prompt
        int bYear = input.nextInt(); // assigning information inputted by user

        // age is calculated based as the difference between the year of birth and the present year.
       age = java.util.Calendar.getInstance().get(Calendar.YEAR) -bYear;

        // maximum heart rate in beats per minutes = 220 - person's age in years
        // this method calculates maximumHeartRate
        maximumHeartRate = 220 - age;

       // target Heart Rate is 0.65 times maximumHeartRate
        targetHeartRate = 0.65 * maximumHeartRate;

        /* OUTPUT SECTION */
        System.out.println(" Your date of birth is: " + bDay + "/" +bMonth + "/" +bYear);
        System.out.println("Based on the information you have provided,\nYour name is: "
                + firstName +" "+ lastName);
        System.out.println("Your maximum heart rate is: " +maximumHeartRate);
        System.out.println("Your target heart rate is about: " + targetHeartRate);
        System.out.println("You are " + age + " years old");
    }




}
