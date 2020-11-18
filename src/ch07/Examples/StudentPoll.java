package ch07.Examples; // Fig. 7.8 StudentPoll.java
// Poll analysis program.

public class StudentPoll
{
    public static void main (String[]args)
    {
        // student response array ( more typically, input at runtime)
        int[]responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};

        int[]frequency = new int[6]; // array of frequency counters

        // for each answer, select responses element and use that value
        // as a frequency index to determine element to increment
        for (int answer = 0; answer < responses.length; answer++)
        {
            try
            {
                ++frequency[responses[answer]];
            } // end try
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf(" responses[%d] = %d\n\n",
                        answer, responses[answer]);
            } // end catch
        } // end for

        System.out.printf("%s%10s\n", "Rating", "Frequency");

        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++)
        System.out.printf("%6d%10d\n", rating, frequency[rating]);
    } // end main
} // end class StudentPoll

/*Twenty students were asked to rate on a scale of 1 to 5 the quality of the food in the
student cafeteria, with 1 being “awful” and 5 being “excellent.” Place the 20 responses
in an integer array and determine the frequency of each rating.*/