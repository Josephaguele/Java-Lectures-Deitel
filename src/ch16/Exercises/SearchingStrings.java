package ch16.Exercises;

import java.util.Scanner;

//16.11 (Searching Strings) Write an application that inputs a line of text and a search character
//and uses String method indexOf to determine the number of occurrences of the character in the
//text.
public class SearchingStrings
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence:");
        String sentence = scanner.nextLine();

        // convert String inputted by user to char
        char[] sentenceArray = sentence.toCharArray();
/*
        for ( char s: sentenceArray)
            System.out.print(s);*/
        System.out.print("Number of occurrences of s is in the sentence  : ");
        countLetters(sentence,'s');
    }

    public static void countLetters(String s, char ch) {
        int count = 0;
        int index = 0;

        while (true)
        {
            index = s.indexOf(ch,index) + 1; // +1 is to continue search from next character after match
            if (index == 0) // if index is 0, add it to the number of index already counted
                break;
            count++;
        }

        System.out.println(count);

    }
}
