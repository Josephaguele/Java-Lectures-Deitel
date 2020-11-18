package ch03.exercises.Invoice;
// Exercise 3.1
// Basic addition with a dialog box
/* This is just a repetition of example 2.7, however, this time we use a dialog box*/
import javax.swing.JOptionPane;

public class AdditionDialog {
    public static void main (String[]args){

        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2

        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number")); // user prompt
        number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number")); // user prompt

        sum = number1 + number2; // add numbers, then store total in sum

        //output
        JOptionPane.showMessageDialog(null, "The sum of both numbers is :" + sum);

    } // end main method
} // end class Addition
