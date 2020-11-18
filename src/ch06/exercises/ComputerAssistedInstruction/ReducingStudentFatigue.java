package ch06.exercises.ComputerAssistedInstruction;
/*6.36 (Computer-Assisted Instruction: Reducing Student Fatigue) One problem in CAI environments
is student fatigue. This can be reduced by varying the computer’s responses to hold the student’s
attention. Modify the program of Exercise 6.35 so that various comments are displayed for
each answer as follows:
Possible responses to a correct answer:
Very good!
Excellent!
Nice work!
Keep up the good work!
Possible responses to an incorrect answer:
No. Please try again.
Wrong. Try once more.
Don't give up!
No. Keep trying.
Use random-number generation to choose a number from 1 to 4 that will be used to select
one of the four appropriate responses to each correct or incorrect answer. Use a switch statement to
issue the responses.*/

import java.util.Random;
import java.util.Scanner;

public class ReducingStudentFatigue {

    private static int correctAnswer; // accurate answer to the question posed to the user

    public static void main(String[] args) {
        System.out.println("***************BASIC MULTIPLICATION TEST REDUCING STUDENT FATIGUE**************");
        calculate(); // calling method calculate
    }// end main

    static void calculate() {
        int counter = 0;
        Random rand = new Random(); // calling class Random
        Scanner sc = new Scanner(System.in); // calling class Scanner

        System.out.print("How many questions are you attempting? "); // user prompt
        int questionCounter = sc.nextInt(); // saving user prompt
        System.out.println("\n There are  " + questionCounter + " questions in this multiplication test ");

        /*while no of questions answered is less than the number of questions to be attempted
         * prompt the user for another question. If the user answer a question wrongly, repeat the
         * same question to the user.*/
        while (counter < questionCounter) {
            int no1 = 1 + rand.nextInt(10); // generating random numbers between 1 to 10
            int no2 = 1 + rand.nextInt(10); // generating random numbers

            correctAnswer = no1 * no2; // accurate answer

            System.out.print("How much is  " + no1 + " times " + no2 + " : ");
            int studentAnswer = sc.nextInt();  // user prompt

            // if student answer is correct, print very good or excellent or nice work etc.
            if (studentAnswer == correctAnswer) {
                int response = 1 + rand.nextInt(5); // generating random numbers for responses from user

                switch (response) { // if random number from response is 0, print very good to user as output etc.
                    case 1:
                        System.out.println("Very good!");
                        break;
                    case 2:
                        System.out.println("Excellent!");
                        break;
                    case 3:
                        System.out.println("Nice work!");
                        break;
                    case 4:
                        System.out.println("Keep up the good work!");
                        break;
                    default:
                        System.out.println("Impressive!");
                } // end switch statement for right answers.
            } // end if statement
            // if student answer is wrong, print wrong answer
            else if (studentAnswer != correctAnswer) {
                int response = 1 + rand.nextInt(5); // generating random numbers for responses from user

                switch (response) // if random number from user response is 0, print
                // no please try again, if no is 1, print wrong. try once more etc.
                {
                    case 1:
                        System.out.println("No. please try again");
                        break;
                    case 2:
                        System.out.println("Wrong. Try once more");
                        break;
                    case 3:
                        System.out.println("Don't give up!");
                        break;
                    case 4:
                        System.out.println("No keep trying");
                        break;

                } // end switch statement of responses  for wrong answers.

                // while the student answer is wrong, prompt the user to try again till
                // he gets the right answer
                while (studentAnswer != correctAnswer) {
                    System.out.println("How much is " + no1 + " times " + no2 + " : ");
                    studentAnswer = sc.nextInt();

                    int response1 = 1 + rand.nextInt(5); // generating random numbers for responses from user

                    if (studentAnswer == correctAnswer) {
                        System.out.println("Yea you are correct!");
                        // if student answer is correct, skip the wrong response section
                        // and move on to the correct answer section.
                        continue;
                    }

                    switch (response1) // if random number from user response is 0, print
                    // no please try again, if no is 1, print wrong. try once more etc.
                    {
                        case 1:
                            System.out.println("No, please try again");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more");
                            break;
                        case 3:
                            System.out.println("Don't give up");
                            break;
                        case 4:
                            System.out.println("No keep trying");
                            break;

                    } // end switch statement of responses  for wrong answers
                } // end while
                if (studentAnswer == correctAnswer) {
                    int response2 = 1 + rand.nextInt(5); // generating random numbers for responses
                    // from user

                    switch (response2) { // if random number from response is 0,
                        // print very good to user as output etc.
                        case 1:
                            System.out.println("Very good");
                            break;
                        case 2:
                            System.out.println("Excellent");
                            break;
                        case 3:
                            System.out.println("Nice work");
                            break;
                        case 4:
                            System.out.println("Keep up the good work");
                            break;
                        default:
                            System.out.println("Impressive");
                    } // end switch statement for right answers.

                } // end if

            } // end else if
            counter++; //
        } // end while loop
    } // end static method calculate

} // end class ReducingStudentFatigue
