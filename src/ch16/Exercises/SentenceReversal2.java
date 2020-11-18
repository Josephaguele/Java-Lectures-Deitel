package ch16.Exercises;

import java.util.Scanner;

//16.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
//text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
//characters as delimiters.
public class SentenceReversal2
{
    // execute application
    public static void main (String[]args)
    {
        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter:");
        String sentence = scanner.nextLine();

        String[]tokens = sentence.split(" "); // break into tokens

        for (String t : tokens) // print out tokens
        {
            StringBuilder buffer = new StringBuilder(t);

            // Mehtod reverse of the StringBuilder class reverses the words
            // Method toString is called to give an output of the reversed words
            // Method concat is actually concatenating an empty space with the reverse words.
            System.out.print(buffer.reverse().toString().concat(" "));
        } // end for loop.

    } // end main
} // end class Sentence Reversal
