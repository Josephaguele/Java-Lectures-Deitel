package ch04.Exercises.e23;
/*4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer
applications. For example, a program that determines the winner of a sales contest would input
the number of units sold by each salesperson. The salesperson who sells the most units wins the contest.
Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines
and prints the largest integer. Your program should use at least the following three variables:
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
input and to determine when all 10 numbers have been processed).
b) number: The integer most recently input by the user.
c) largest: The largest number found so far.

4.23 (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]*/

import java.util.Scanner;

public class TwoLargestNumber {

    public TwoLargestNumber()
    {

    } // CONSTRUCTOR

    // method to find the largest number
    public void findTwoLargestNumber()
    {
        Scanner input = new Scanner(System.in);
        int counter = 0; // keeps track of how many numbers have been entered and determines when
        // all numbers have been processed.
        int firstLargest = 0, secondLargest = 0;

        int number;

        while ( counter <= 10)
        {
            System.out.print("Enter the number of units you have sold: ");
            number = input.nextInt();

            if (number > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = number;
            }
            else if ( number > secondLargest)
            {
                secondLargest = number;
            }
            counter ++;

        }
        System.out.println("The two largest  units sold are: " + firstLargest + ", " +secondLargest);
    }
}
