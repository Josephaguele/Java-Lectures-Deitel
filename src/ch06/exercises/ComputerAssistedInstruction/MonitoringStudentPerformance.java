package ch06.exercises.ComputerAssistedInstruction;

import java.util.Random;
import java.util.Scanner;

/*6.37 (Computer-Assisted Instruction: Monitoring Student Performance) More sophisticated
computer-assisted instruction systems monitor the student’s performance over a period of time. The
decision to begin a new topic is often based on the student’s success with previous topics. Modify
the program of Exercise 6.36 to count the number of correct and incorrect responses typed by the
student. After the student types 10 answers, your program should calculate the percentage that are
correct. If the percentage is lower than 75%, display "Please ask your teacher for extra help.",
then reset the program so another student can try it. If the percentage is 75% or higher, display
"Congratulations, you are ready to go to the next level!", then reset the program so another
student can try it.*/
public class MonitoringStudentPerformance {

    private static int correctAnswer; // accurate answer to the question posed to the user

    public static void main(String[] args) {
        System.out.println("***************BASIC MULTIPLICATION TEST MONITORING STUDENT PERFORMANCE**************");
        calculate(); // calling method calculate
    }// end main

    static void calculate() {
        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;

        System.out.println("\n There are ten questions in this multiplication test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(10); // generating random numbers

            correctAnswer = no1 * no2; // accurate answer

            System.out.print("How much is  " + no1 + " times " + no2 + " : ");
            int studentAnswer = sc.nextInt();  // user prompt

            // if student answer is correct, increment correct answer count
            if (studentAnswer == correctAnswer) {
                correctAnswerCount++; // increment correct answer count
            } // end if statement
            // if student answer is wrong, increment wrong answer count
            else if (studentAnswer != correctAnswer) {
                wrongAnswerCount++;
            } // end else if
            counter++; //
        } // end while loop

        // OUTPUT TO THE USER
        if( correctAnswerCount  <  7) // if student scores less than 7, print the statement below
            System.out.println(" Ask your teacher for help\n You failed  "+ wrongAnswerCount + " questions");
        else if (correctAnswerCount >= 7) // if the student score is 7 upwards, print the statement below
            System.out.println("Congratulations! you are ready to go the next level\n" +
                    "You scored " + correctAnswerCount * 10+"%");
    } // end static method calculate
}
