package ch05.Exercises;

import java.util.Scanner;

public class SmallestValue {
    public static void main (String[]args)
    {
        Scanner data = new Scanner(System.in);
        int num;
        int temp;
        int i;
        int smallest;

        // Reading numbers want to be read
        System.out.print("Enter the number of integers to be read: ");
        num = data.nextInt();

        System.out.println("Enter " +num+ " numbers"); // Reading 1st number
        smallest = data.nextInt();

        // Reading other number
        for (i = 1; i<num; i++)
        {
            temp = data.nextInt();
            if(temp > smallest)
            {
                continue;
            } else
                smallest = temp;
        }

        System.out.println("The smallest number is : " + smallest);



    }
}
