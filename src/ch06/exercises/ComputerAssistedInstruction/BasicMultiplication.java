package ch06.exercises.ComputerAssistedInstruction;

import java.util.Random;
import java.util.Scanner;

/*6.35 (Computer-Assisted Instruction) The use of computers in education is referred to as
 computer-assisted instruction (CAI). Write a program that will help an elementary school
 student learn multiplication. Use a Random object to produce two positive one-digit integers.
 The program should then prompt the user with a question, such as How much is 6 times 7?
The student then inputs the answer. Next, the program checks the student’s answer. If it’s correct,
display the message "Very good!" and ask another multiplication question. If the answer is wrong,
display the message "No. Please try again." and let the student try the same question repeatedly
until the student finally gets it right. A separate method should be used to generate each new question.
This method should be called once when the application begins execution and each time the
user answers the question correctly.*/
public class BasicMultiplication {

    private static int correctAnswer;
    private static int wrongAnswer;

    public static void main (String[]args)
    {
        System.out.println("************BASIC MULTIPLICATION TEST************");
        calculate(); // calling method calculate
    }// end main

    static void calculate(){

        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner

        System.out.println("How many questions are you attempting? "); // user prompt
        int questionCounter = sc.nextInt(); // saving user prompt

        /*while no of questions answered is less than the number of questions to be attempted
         * prompt the user for another question. If the user answer a question wrongly, repeat the
         * same question to the user.*/
        while ( counter < questionCounter){
            int no1 = 1 + rand.nextInt(10); // generating random numbers
            int no2 = 1 + rand.nextInt(10); // generating random numbers

            correctAnswer = no1 * no2; // accurate answer

            System.out.print("How much is  "+ no1 + " times " + no2 + " : ");
            int studentAnswer = sc.nextInt();  // user prompt

            // if student answer is correct, print very good
            if (studentAnswer == correctAnswer)
                System.out.println("very good");

                // if student answer is wrong, print wrong answer
            else if (studentAnswer != correctAnswer)
            {
                System.out.println("Please try again");

                // while the student answer is wrong, prompt the user to try again till
                // he gets the right answer
                while (studentAnswer != correctAnswer)
                {
                    System.out.println("How much is "+ no1 + " times " + no2 + " : ");
                    studentAnswer = sc.nextInt();
                }

                if (studentAnswer == correctAnswer){
                    System.out.println("very good");
                } // end if
            } // end else if
            counter++;
        } // end while loop
    } // end static method calculate

} // END CLASS BASICMULTIPLICATION
