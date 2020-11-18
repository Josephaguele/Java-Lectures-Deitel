package ch07.Exercises;

public class question7 {

    static int[][]t = new int[2][3]; // declaration of a 2x3 integer array t

    public static void main (String[]args)
    {

        // nested for statement that inputs the values for the elements of t from the user.
        for (int x = 0; x < t.length; x++)
        {
            for (int y = 0; y < t[x].length; y++)
            {
                t[x][y] = 1;
                System.out.println(t[x][y]);
            } // end inner for
        }// end outer for


        for (int[] s : t){
            for (int g: s){
                System.out.println(s[g]);
            }
        }
    } // end main class


    // write a series of statements taht determines and displays the smallest value in t.
    public int determineSmallestValue()
    {
        // assume that the first element of t is the smallest value
        int dSmallest = t[0][0];

        // loop through the rows in t
        for (int [] smallest : t)
        {
            // loop through the columns in the current row
            for (int smallestValue : smallest)
            {
                // if smallestValue found is less than dSmallest, then assign the smallestValue
                // to the dSmallest
                if ( smallestValue < dSmallest)
                {
                    dSmallest = smallestValue;
                } // end if statement

            } // end inner for statement
        } // end outer for
        return  dSmallest;
    } // end determineSmallestValue


}
