package ch19.LinearSearch; // Fig 19.2: LinearArray.java
// Class that contains an array of random integers and a method
// that will search that array sequentially.
import java.util.Arrays;
import java.util.Random;

public class LinearArray
{
    private int[] data; // array of values
    private static final Random generator = new Random();

    // CREATE array of given size and fill with random numbers
    public LinearArray(int size)
    {
        data = new int[size]; // create space for array

        // fill array with random ints in range 10 - 99
        for ( int i = 0; i < size; i++)
            data[i] = 10 + generator.nextInt(90);
    } // end LinearArray Constructor

    // perform a linear search on the data
    public int linearSearch ( int searchKey)
    {
        // loop through array sequentially
        for ( int index = 0; index < data.length; index++)
            if (data[index] == searchKey)
                return index; // return index of integer

        return -1; // integer was not found
    } // end method linearSearch

    // method to output values in array
    public String toString()
    {
        return Arrays.toString(data);
    } // end method toString
} // end class LinearArray
