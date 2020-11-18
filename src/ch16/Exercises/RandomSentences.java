package ch16.Exercises;
//16.5 (Random Sentences) Write an application that uses random-number generation to create sentences.
// Use four arrays of strings called article, noun, verb and preposition. Create a sentence by selecting a word at
// random from each array in the following order: article, noun, verb, preposition, article and noun.
// As each word is picked, concatenate it to the previous words in the sentence.
// The words should be separated by spaces. When the final sentence is output, it should start
//with a capital letter and end with a period. The application should generate and display 20 sentences.
//The article array should contain the articles "the", "a", "one", "some" and "any";
// the noun array should contain the nouns "boy", "girl", "dog", "town" and "car";
// the verb array should contain the verbs "drove", "jumped", "ran","walked" and "skipped";
// the preposition array should contain the prepositions "to", "from", "over", "under" and "on".

import java.util.Random;

public class RandomSentences
{
    public static void main (String[]args)
    {
        String[]articles = {"the", "a", "one", "some", "any"}; // declaring array articles
        String[]nouns = {"boy", "girl", "dog", "town", "car"}; // declaring array nouns
        String[]verbs = {"drove", "jumped", "ran","walked", "skipped"}; // declaring array verbs
        String[]prepositions = {"to", "from", "over", "under" , "on"}; // declaring array prepositions

        Random randomNumber = new Random(); // calling class RandomNumber

        int count = 1; // count for the number of sentences generated so far

        while ( count < 21) // while counter is less than 21, generate sentence. This means it should generate
            // 20 sentences.
        {
            // generating random numbers from 1 to 5 which covers the array listings
            /*In this random number section, I could have chosen just one variable for all but they looked to similar
            * because I was doing that, so I decided to use multiple variables like worda, noun, v and p */
            int worda =   randomNumber.nextInt(5);
            int noun =   randomNumber.nextInt(5);
            int v =   randomNumber.nextInt(5);
            int p =   randomNumber.nextInt(5);



            /* sentence must be in the following order: article, noun, verb, preposition, article and noun and with
            * spaces in between words.*/
            String sentence =  articles[worda].concat(" ").concat(nouns[noun]).concat(" ").concat(verbs[v])
                    .concat(" ").concat(prepositions[p]).concat(" ").concat(articles[noun]).concat(" ").
                            concat(nouns[p]);


            //When the final sentence is output, it should start
            //with a capital letter and end with a period. The application should generate and display 20 sentences.
            if (count == 20 )
            {
                 sentence =  articles[worda].toUpperCase().
                         concat(" ").concat(nouns[noun]).concat(" ").concat(verbs[v])
                        .concat(" ").concat(prepositions[p]).concat(" ").concat(articles[worda]).concat(" ").
                                concat(nouns[p]).concat(".");
            } // end if statement

            System.out.println("Sentence" + count + ": " + sentence); //print sentence

            count++; // increment the sentence counter
        } // end while statement


    } // end main method
} // end class RandomSentences
