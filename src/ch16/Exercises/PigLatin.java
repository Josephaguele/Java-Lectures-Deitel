package ch16.Exercises;

import java.util.Scanner;

//16.7 (Pig Latin) Write an application that encodes English-language phrases into pig Latin. Pig
//Latin is a form of coded language. There are many different ways to form pig Latin phrases. For
//simplicity, use the following algorithm:
//To form a pig Latin phrase from an English-language phrase, tokenize the phrase into words
//with String method split. To translate each English word into a pig Latin word, place the first
//letter of the English word at the end of the word and add the letters “ay.” Thus, the word “jump”
//becomes “umpjay,” the word “the” becomes “hetay,” and the word “computer” becomes “omputercay.”
// Blanks between words remain as blanks. Assume the following: The English phrase consists of
//words separated by blanks, there are no punctuation marks and all words have two or more letters.
//Method printLatinWord should display each word. Each token is passed to method printLatinWord to print the pig
// Latin word. Enable the user to input the sentence. Keep a running display ofall the converted sentences in a
// text area.
public class PigLatin
{
    public static void main (String[]args)
    {
        Scanner userInput = new Scanner (System.in); /// calling Scanner class

        System.out.println("Enter a sentence,\n" +
                "Ensure that there are no punctuation marks in your sentence: "); // user prompt
        String sentence = userInput.nextLine(); // save user input

        // process user sentence
        String[]tokens = sentence.split(" ");

        for (String t: tokens)
        { // get each word and remove the first letter of that word and leave the remaining substring. eg. jump = ump
            String a = t.substring(1,t.length());

            // then remove the first letter of the word to be used separately
           String firstLetter = t.substring(0,1);

            // now add the substring, the firstLetter and ay
           String newWord = a.concat(firstLetter).concat("ay");
           System.out.print(newWord + " "); // print out the converted statement in the new latin language

        } // end for statement




    } // end main method
}
