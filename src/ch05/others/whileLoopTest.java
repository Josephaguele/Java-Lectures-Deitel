package ch05.others;
/*Print the integers from 1 to 20, using a while loop and the counter variable i. Assume
that the variable i has been declared, but not initialized. Print only five integers per line.
[Hint: Use the calculation i % 5.When the value of this expression is 0, print a newline
character; otherwise, print a tab character. Assume that this code is an application. Use
the System.out.println() method to output the newline character, and use the System.
out.print( '\t' ) method to output the tab character.]*/
public class whileLoopTest {
    public static void main (String[]args)
    {
        int i = 0;
        while (i<20){
            System.out.println(i);
            i++;
        }
    }
}
