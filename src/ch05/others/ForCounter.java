package ch05.others;
// Counter-controlled repetition with the for repetition statement.
public class ForCounter
{
    public static void main(String[]args)
    {
        // for statement header includes initialization. /
        // loop-continuation condition and statement
        for ( int counter = 1; counter <= 10; counter++ )
            System.out.printf("%d ", counter);

        System.out.println(); // output a new line
    } // end main
} // end class ForCounter
