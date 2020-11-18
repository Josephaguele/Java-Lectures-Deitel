package ch16.Exercises;
//16.6 (Project: Limericks) A limerick is a humorous five-line verse in which the first and second
//lines rhyme with the fifth, and the third line rhymes with the fourth. Using techniques similar to
//those developed in Exercise 16.5, write a Java application that produces random limericks. Polishing
//this application to produce good limericks is a challenging problem, but the result will be worth the
//effort

import java.util.Random;

public class Limericks
{
    public static void main (String[]args)
    {
        String[]articles = {"the", "a", "one", "some", "any","there","they","an",}; // declaring array articles
        String[]nouns = {"boy", "girl", "dog", "town", "car","street","child","country"}; // declaring array nouns
        String[]verbs = {"drove", "jumped", "ran","walked", "skipped","startled","smiled","flew","sped"}; // declaring array verbs
        String[]prepositions = {"to", "from", "over", "under" , "on","on top"," in","down"}; // declaring array prepositions

        Random randomNumber = new Random(); // calling class RandomNumber

        int count = 1; // count for the number of sentences generated so far

        while ( count < 6) // while counter is less than 6, generate sentence. This means it should generate
        // 5 sentences.
        {
            // generating random numbers from 1 to 5 which covers the array listings
            /*In this random number section, I could have chosen just one variable for all but they looked to similar
             * because I was doing that, so I decided to use multiple variables like worda, noun, v and p */
            int worda =   randomNumber.nextInt(8);
            int noun =   randomNumber.nextInt(8);
            int v =   randomNumber.nextInt(8);
            int p =   randomNumber.nextInt(8);



            /* sentence must be in the following order: article, noun, verb, preposition, article and noun and with
             * spaces in between words.*/
            String sentence =  articles[worda].concat(" ").concat(nouns[noun]).concat(" ").concat(verbs[v])
                    .concat(" ").concat(prepositions[p]).concat(" ").concat(articles[noun]).concat(" ").
                            concat(nouns[p]);

            System.out.println("Sentence" + count + ": " + sentence); //print sentence

            count++; // increment the sentence counter
        } // end while statement


    } // end main method
}
