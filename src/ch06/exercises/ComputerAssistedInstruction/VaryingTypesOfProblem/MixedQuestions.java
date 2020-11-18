package ch06.exercises.ComputerAssistedInstruction.VaryingTypesOfProblem;

import java.util.Random;
import java.util.Scanner;

public class MixedQuestions {

    private static double correctAnswer; // accurate answer to the question posed to the user
    static Scanner sc = new Scanner(System.in); // calling class Scanner


    void difficultyRequiredbyUser(){

        System.out.println("You have opted to do the Mixed Arithmetic test.");
        System.out.println("***************MIXED ARITHMETIC TEST WITH DIFFICULTY LEVELS**************");

        /*prompts user to enter the level of difficulty they want*/
        System.out.print("Enter level of difficulty\n" +
                "Enter 1 for  basic difficulty:\n" +
                "Enter 2 for  intermediate difficulty:\n" +
                "And 3 for advanced difficulty:");
        int difficultyLevel = sc.nextInt(); // saves users input

        // gives user questions based on the user's level of difficulty
        if (difficultyLevel == 1)  // if user enters 1, basic level of difficulty is set up
            varyingProblemsBasic();
        else if (difficultyLevel == 2)
            varyingProblemsIntermediate();
        else if (difficultyLevel == 3)
            varyingProblemsAdvanced();
        else varyingProblemsBasic();
    }
    static void varyingProblemsBasic() {
        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;
        double studentAnswer = 0;


        System.out.println("\n There are ten arithmetic questions in this test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10

            /*Generating question Type of different arithmetics using the random number
            so this means integer questionType can either be 0,1,2 or 3
            * 0 for multiplication
            * 1 for addition
            * 2 for subtraction
            * 3 for division*/
            int questionType = rand.nextInt(4);

            switch (questionType) {
                case 0:
                    System.out.print("How much is  " + no1 + " times " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 * no2; // accurate answer
                    break; // if the question has been asked skip to another question
                case 1:
                    System.out.print("How much is  " + no1 + " + " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 + no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 2:
                    System.out.print("How much is  " + no1 + " - " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 - no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 3:
                    System.out.print("How much is  " + no1 + " / " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 / no2; // accurate answer
                    break;// if the question has been asked skip to another question
            } // end switch statement questionType

            // if student answer is correct, increment correct answer count
            if (studentAnswer == correctAnswer) {
                correctAnswerCount++; // increment correct answer count
            } // end if statement
            // if student answer is wrong, increment wrong answer count
            else if (studentAnswer != correctAnswer) {
                wrongAnswerCount++;
            } // end else if
            counter++; // increment the counter until the questions are 10 in number
        } // end while loop


        // OUTPUT TO THE USER
        if (correctAnswerCount < 7) // if student scores less than 7, print the statement below
            System.out.println(" Ask your teacher for help\n You failed" +
                    "  " + wrongAnswerCount + " questions");
        else if (correctAnswerCount >= 7) // if the student score is 7 upwards, print the statement below
            System.out.println("Congratulations! you are ready to go the next level\n" +
                    "You scored " + correctAnswerCount * 10 + "%");
    } // end static method varyingProblemsBasic

    static void varyingProblemsIntermediate() {
        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;
        double studentAnswer = 0;


        System.out.println("\n There are ten arithmetic questions in this test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10

            /*Generating question Type of different arithmetics using the random number
            so this means integer questionType can either be 0,1,2 or 3
            * 0 for multiplication
            * 1 for addition
            * 2 for subtraction
            * 3 for division*/
            int questionType = rand.nextInt(4);

            switch (questionType) {
                case 0:
                    System.out.print("How much is  " + no1 + " times " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 * no2; // accurate answer
                    break; // if the question has been asked skip to another question
                case 1:
                    System.out.print("How much is  " + no1 + " + " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 + no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 2:
                    System.out.print("How much is  " + no1 + " - " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 - no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 3:
                    System.out.print("How much is  " + no1 + " / " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 / no2; // accurate answer
                    break;// if the question has been asked skip to another question
            } // end switch statement questionType

            // if student answer is correct, increment correct answer count
            if (studentAnswer == correctAnswer) {
                correctAnswerCount++; // increment correct answer count
            } // end if statement
            // if student answer is wrong, increment wrong answer count
            else if (studentAnswer != correctAnswer) {
                wrongAnswerCount++;
            } // end else if
            counter++; // increment the counter until the questions are 10 in number
        } // end while loop


        // OUTPUT TO THE USER
        if (correctAnswerCount < 7) // if student scores less than 7, print the statement below
            System.out.println(" Ask your teacher for help\n You failed" +
                    "  " + wrongAnswerCount + " questions");
        else if (correctAnswerCount >= 7) // if the student score is 7 upwards, print the statement below
            System.out.println("Congratulations! you are ready to go the next level\n" +
                    "You scored " + correctAnswerCount * 10 + "%");
    } // end static method varyingProblemsIntermediate

    static void varyingProblemsAdvanced() {
        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner
        int correctAnswerCount = 0;
        int wrongAnswerCount = 0;
        double studentAnswer = 0;


        System.out.println("\n There are ten arithmetic questions in this test ");

        /*while no of questions answered is less than 10, ASK student another question.*/
        while (counter < 10) {
            int no1 = 1 + rand.nextInt(100); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(100); // generating random numbers between 1 to 10

            /*Generating question Type of different arithmetics using the random number
            so this means integer questionType can either be 0,1,2 or 3
            * 0 for multiplication
            * 1 for addition
            * 2 for subtraction
            * 3 for division*/
            int questionType = rand.nextInt(4);

            switch (questionType) {
                case 0:
                    System.out.print("How much is  " + no1 + " times " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 * no2; // accurate answer
                    break; // if the question has been asked skip to another question
                case 1:
                    System.out.print("How much is  " + no1 + " + " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 + no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 2:
                    System.out.print("How much is  " + no1 + " - " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 - no2; // accurate answer
                    break;// if the question has been asked skip to another question
                case 3:
                    System.out.print("How much is  " + no1 + " / " + no2 + " : "); // user prompt
                    studentAnswer = sc.nextDouble();  // save user prompt
                    correctAnswer = no1 / no2; // accurate answer
                    break;// if the question has been asked skip to another question
            } // end switch statement questionType

            // if student answer is correct, increment correct answer count
            if (studentAnswer == correctAnswer) {
                correctAnswerCount++; // increment correct answer count
            } // end if statement
            // if student answer is wrong, increment wrong answer count
            else if (studentAnswer != correctAnswer) {
                wrongAnswerCount++;
            } // end else if
            counter++; // increment the counter until the questions are 10 in number
        } // end while loop


        // OUTPUT TO THE USER
        if (correctAnswerCount < 7) // if student scores less than 7, print the statement below
            System.out.println(" Ask your teacher for help\n You failed" +
                    "  " + wrongAnswerCount + " questions");
        else if (correctAnswerCount >= 7) // if the student score is 7 upwards, print the statement below
            System.out.println("Congratulations! you are ready to go the next level\n" +
                    "You scored " + correctAnswerCount * 10 + "%");
    } // end static method varyingProblemsAdvanced



}
