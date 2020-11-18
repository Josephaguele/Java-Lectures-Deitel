package ch03.ex; // Fig. 3.5: GradebookTest.java
//Create Gradebook object and pass a String to its displayMessage method
import java.util.Scanner;

public class GradebookTest {

    // main method begins program execution
    public static void main (String[]args){
        // create  Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // create a Gradebook object and assing it to myGradebook
        Gradebook myGradebook = new Gradebook();

        // prompt for and input course name
        System.out.println("Please enter the course name:");
        String nameOfCourse = input.nextLine(); // read a line of text
        System.out.println(); // outputs a blank line

        // call myGradeBook's displayMessage method
        // and pass nameOfCourse as an argument
        myGradebook.displayMessage(nameOfCourse);
    } // end main
} // end class GradeBookTest
