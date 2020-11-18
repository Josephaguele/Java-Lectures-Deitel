package ch07.Exercises; // Exercise 7.12

import java.util.Scanner;

/*7.12 (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs five numbers, each between 10 and 100, inclusive. As each number
is read, display it only if it’s not a duplicate of a number already read. Provide for the “worst case,”
in which all five numbers are different. Use the smallest possible array to solve this problem. Display
the complete set of unique values input after the user enters each new value.*/
public class DuplicateElimination
{
    static int[]arrValues = new int[5];
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        while (count !=5)
        {
            System.out.printf("Enter value %d/5 between 10 and 100", count + 1 );
            int number = sc.nextInt();

            // ENSURE INPUT IS WITHIN RANGE
            if (number <10 || number > 100)
                continue;

            // print unique values
            if (isUnique(number))
                System.out.printf("Unique value: %d\n" , number);
            try{
                // add to array and increase counter
                arrValues[count++] = number;
            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
            }

            // display complete set of unique values
            printUnique();
        }
    }

    public static boolean isUnique(int num)
    {
        for (int i = 0; i < arrValues.length; i ++)
        {
            if ( arrValues[i] == num)
                return false;
        }
        return true;
    }
    // ensure value is unique
    // Arrays.binarySearch() for some reason does not work so needed this
    public static void printUnique()
    {
        System.out.print("Unique values:"+ ",");

        // base case is always first element
        System.out.print(arrValues[0] + "");

        // unique value storage
        int unique = 0;

        // loop through remainder
         for (int i = 1; i < arrValues.length; i++)
         {
             // only check if value > 0
             //avoids redundant checking before array is filled
             if (arrValues[i] > 0)
             {
                 // loop backwards checking for duplicates
                 for (int j = i -1; j >= 0; j--)
                 {
                     if (arrValues[i] == arrValues[j])
                     {
                         unique = 0;
                         break;
                     } else
                         {
                             unique = arrValues[i];
                         } // end else
                     if (unique > 0)
                     {
                         System.out.print( unique + "");
                     } else
                     {
                         continue;
                     }
                 } // end for statement
                 System.out.println();
             }
         }
    }
} // end class DuplicateElimination
