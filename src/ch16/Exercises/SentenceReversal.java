package ch16.Exercises;

import java.util.Scanner;

//16.9 (Displaying a Sentence with Its Words Reversed) Write an application that inputs a line of
//text, tokenizes the line with String method split and outputs the tokens in reverse order. Use space
//characters as delimiters.
public class SentenceReversal
{
    // execute application
    public static void main (String[]args)
    {
        // get sentence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter:");
        String sentence = scanner.nextLine();

        // process user sentence
        String[]tokens = sentence.split(" ");

        for ( int i = tokens.length -1; i >= 0; i--) // PROCESS USER INPUT  and reverse the sentence by each word
        { // Print user input in  a reversed sentence format
            System.out.print(tokens[i] +" ");
        } // end for statement


        /** Process user input and reverse the sentence by each letter**/
        System.out.println("\nPrinting the whole sentence in total reversed other including reversing the token");
        for ( int i = tokens.length -1; i >= 0; i--) // PROCESS USER INPUT FROM THE REVERSED END
        { // Print user input in  a reversed format
            String word =tokens[i];

            for (int j = word.length()-1; j >=0; j--)
                System.out.print(word.charAt(j));

        } // end for statement
    } // end main
} // end class Sentence Reversal
