package ch06.exercises.ComputerAssistedInstruction.VaryingTypesOfProblem;

import java.util.Random;
import java.util.Scanner;

public class Addition {

    private static int correctAnswer; // accurate answer to the question posed to the user

    static Random rand = new Random(); // calling class Random
    static Scanner sc = new Scanner(System.in); // calling class Scanner

    void difficultyRequiredbyUser(){

        System.out.println("You have opted to do the Addition test.");
        System.out.println("***************ADDITION TEST WITH DIFFICULTY LEVELS**************");

        /*prompts user to enter the level of difficulty they want*/
        System.out.print("Enter level of difficulty\n" +
                "Enter 1 for  basic difficulty:\n" +
                "Enter 2 for  intermediate difficulty:\n" +
                "Enter 3 for  professional difficulty:\n" +
                "And 4 for  expert difficulty:");
        int difficultyLevel = sc.nextInt(); // saves users input

        // gives user questions based on the user's level of difficulty
        if (difficultyLevel == 1)  // if user enters 1, basic level of difficulty is set up
            difficultylevelOne();
        else if (difficultyLevel == 2)
            difficultylevelTwo();
        else if (difficultyLevel == 3)
            difficultyLevelThree();
        else difficultyLevelFour();
    }

    static void difficultylevelOne() {
        int counter = 0; // question counter

        int correctAnswerCount = 0; // counter of correct answers
        int wrongAnswerCount = 0; // counter of wrong answers

        System.out.println("\n There are ten questions in this addition test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(10); // generating random numbers

            correctAnswer = no1 + no2; // accurate answer

            System.out.print("How much is  " + no1 + " + " + no2 + " : ");
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

        System.out.println("\n There are ten questions in this addition test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100
            int no2 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10

            correctAnswer = no1 + no2; // accurate answer

            System.out.print("How much is  " + no1 + " + " + no2 + " : ");
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

        System.out.println("\n There are ten questions in this addition test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100
            int no2 = 1 + rand.nextInt(100); // generating random numbers between 1 to 100

            correctAnswer = no1 + no2; // accurate answer

            System.out.print("How much is  " + no1 + " + " + no2 + " : ");
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
            int no2 = 1 + rand.nextInt(1000); // generating random numbers between 1 to 100

            correctAnswer = no1 + no2; // accurate answer

            System.out.print("How much is  " + no1 + " + " + no2 + " : ");
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
