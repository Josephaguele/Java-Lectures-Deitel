package ch06.exercises.ComputerAssistedInstruction;

import java.util.Random;
import java.util.Scanner;

/*6.38 (Computer-Assisted Instruction: Difficulty Levels) Exercise 6.35 through Exercise 6.37 developed
a computer-assisted instruction program to help teach an elementary school student multiplication.
Modify the program to allow the user to enter a difficulty level. At a difficulty level of 1,
the program should use only single-digit numbers in the problems; at a difficulty level of 2, numbers
as large as two digits, and so on.*/
public class DifficultyLevels {
    private static int correctAnswer; // accurate answer to the question posed to the user

    static Random rand = new Random(); // calling class Random
    static Scanner sc = new Scanner(System.in); // calling class Scanner

    public static void main(String[] args) {
        System.out.println("***************MULTIPLICATION TEST WITH DIFFICULTY LEVELS**************");

        /*prompts user to enter the level of difficulty they want*/
        System.out.print("Enter level of difficulty\n" +
                "Enter 1 for level basic difficulty:\n" +
                "Enter 2 for level intermediate difficulty:\n" +
                "Enter 3 for level professional difficulty:\n" +
                "And 4 for level expert difficulty:");
        int difficultyLevel = sc.nextInt(); // saves users input

        // gives user questions based on the user's level of difficulty
        if (difficultyLevel == 1)  // if user enters 1, basic level of difficulty is set up
            difficultylevelOne();
        else if (difficultyLevel == 2)
            difficultylevelTwo();
        else if (difficultyLevel == 3)
            difficultyLevelThree();
        else difficultyLevelFour();
    }// end main

    static void difficultylevelOne() {
        int counter = 0; // question counter

        int correctAnswerCount = 0; // counter of correct answers
        int wrongAnswerCount = 0; // counter of wrong answers

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
    } // end static method difficultylevelOne
    static void difficultylevelTwo() {
        int counter = 0; // question counter

        int correctAnswerCount = 0; // counter of correct answers
        int wrongAnswerCount = 0; // counter of wrong answers

        System.out.println("\n There are ten questions in this multiplication test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100
            int no2 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10

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
    } // end static method difficultylevelTwo
    static void difficultyLevelThree() {
        int counter = 0; // question counter

        int correctAnswerCount = 0; // counter of correct answers
        int wrongAnswerCount = 0; // counter of wrong answers

        System.out.println("\n There are ten questions in this multiplication test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100
            int no2 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100

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
    } // end static method difficultyLevelThree
    static void difficultyLevelFour() {
        int counter = 0; // question counter

        int correctAnswerCount = 0; // counter of correct answers
        int wrongAnswerCount = 0; // counter of wrong answers

        System.out.println("\n There are ten questions in this multiplication test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(1000); // generating random numbers between 1 to 1000
            int no2 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100

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
    } // end static method difficultyLevelFour

}
