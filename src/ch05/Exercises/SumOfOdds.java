package ch05.Exercises;
//Sum the odd integers between 1 and 99, using a for statement. ASSUME THAT THE INTEGER variables
// sum and count have been declared.
public class SumOfOdds {

    public static void main (String[]args)
    {
        int count = 1;
        int sum = 0;

        for (count = 1; count <= 99; count+=2 )
        {
            sum +=count;

        } System.out.println(sum);


         /* The same thing can be written using the while statement like this.
         while ( count <= 99)
        {
            if (count %2 != 0)
            {
                sum += count;
                System.out.println(sum);
            }
            count++;
        }
        System.out.println("The sum of the odd integers is: " + sum);*/
    }
}
