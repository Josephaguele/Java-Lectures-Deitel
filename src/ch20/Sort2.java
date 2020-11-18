package ch20; // Fig 20.7 Sort1.java
// Using a  Comparator object with method sort.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args)
    {
        String[]suits = {"Hearts", "Diamonds", "Clubs",  "Spades"};

        // create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits); // create list
        System.out.printf("Unsorted array elements: %s\n", list);

        // sort in descending order using a comparator
        Collections.sort(list, Collections.reverseOrder());

        // output list elements
        System.out.printf("Sorted list elements: %s\n", list);
    } // end main
} // end class Sort2
