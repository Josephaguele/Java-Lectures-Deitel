package ch06.exercises.ComputerAssistedInstruction.VaryingTypesOfProblem;

import java.util.Scanner;

/*6.39 (Computer-Assisted Instruction: Varying the Types of Problems) Modify the program of
Exercise 6.38 to allow the user to pick a type of arithmetic problem to study. An option of 1 means
addition problems only, 2 means subtraction problems only, 3 means multiplication problems only,
4 means division problems only and 5 means a random mixture of all these types.*/
public class VaryingTypesOfProblem {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the arithmetic problem to study\n" +
                "An option of 1 gives you addition problems only\n" +
                "An option of 2 gives you subtraction problems only\n" +
                "An option of 3 gives you multiplication problems only\n" +
                "An option of 4 gives you division problems only\n" +
                "An option of 5 gives you random mixture of all these types");

        System.out.print("Enter an option: "); // user prompt
        int option = userInput.nextInt(); // save option from user

        /*IF THE USER CHOOSES 1, THE ADDITION TEST WILL SHOW UP
        * IF THE USER CHOOSES 2 THE  SUBTRACTION TEST WILL COME UP
        * IF THE USER CHOOSES 3, THE MULTIPLIATION TEST WILL COME UP
        * IF THE USER CHOOSES 4, THE DIVISION TEST WILL COME UP
        * IF THE USER CHOOSES 5, THE MIXED QUESTIONS WILL COME UP*/
        switch (option) {
            case 1:
                Addition addition = new Addition(); // calling Addition Class
                addition.difficultyRequiredbyUser();  // calling method from addition
                break;
            case 2:
                Subtraction subtraction = new Subtraction(); // calling Subtraction class
                subtraction.difficultyRequiredbyUser();
                break;
            case 3:
                Multiplication multiplication = new Multiplication(); // calling Multiplication class
                multiplication.difficultyRequiredbyUser(); // calling method from multiplication class
                break;
            case 4:
                Division divide = new Division();
                divide.difficultyRequiredbyUser();
                break;
            case 5:
                MixedQuestions allTypes = new MixedQuestions();
                allTypes.difficultyRequiredbyUser();
                break;

        }
    } // end main method
} // end class VaryingTypesOfProblem
