package ch04.Exercises.e24;

// Fig 4.22 Analysis.java
// tHIS MODIIFES THE PROGRAM IN FIG 4.12 by validating the inputs. For any input, if the value entered
// is other than 1 or 2, keep looping until the user enters a correct value.

// Analysis of examination results using nested control statements.
import java.util.Scanner; // class uses class Scanner

public class Analysis
{
    public static void main(String[]args)
    {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initializing variables in the declarations
        int passes = 0; // number of passes
        int failures  = 0; // number of failures
        int studentCounter = 1; // student counter
        int result; // one exam result (obtains value from user)

        // process 10 students using counter-controlled loop
        while( studentCounter <= 10)
        {
            // prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");

            result = input.nextInt();


            // if...else is nested in the while statement
            if( result == 1)             // if result 1,
                passes = passes +1;     // increment passes;
            else if(result == 2)                       // else result is not 1, so
                failures = failures + 1;// increment failures
            else
                System.out.println("Results can be entered either as 1 or 2 ");

            // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        } // end while

        // termatination phase; prepare and display results
        System.out.printf("Passed: %d\nFailed: %d\n", passes, failures);

        // determine whether more than 8 students passed
        if (passes >  8)
            System.out.println("Bonus to instructor");
    } // end main
} // end class Analysis
