package ch06.exercises;

import java.util.Random;

public class RandomNumbering {
    public static void main (String[]args){

        Random random = new Random();

        // Random number generation
        System.out.println("Random number generation");
        int n = 1 + random.nextInt(2);
        System.out.println("1 <= n <= 2 , and n is:\t" + n);

        int a = 1 + random.nextInt(100);
        System.out.println("1 <= a and a <= 100:\t" + a);

        int b = random.nextInt(9);
        System.out.println("0 <=b and b <= 9:\t " +b);

        int c = 1000+ random.nextInt(112);
        System.out.println("1000 <=c and c<= 1112, therefore d is:\t" + c);

        int d = -3 + random.nextInt(11);
        System.out.println("-3 <=d <= 11, therefore d is:" + d);

        /* number = shiftingValue + difference BtwValues * randomNu.nextInt(scalingFactor);*/
        int e = 2 + 2 * random.nextInt(5);
        System.out.println(e); // generates random numbers from: 2,4,6,8,10

        int f = 3 + 2 * random.nextInt(5);
        System.out.println(f); // generates random numbers from :3,5,7,9,11

        int g = 6 + 4 * random.nextInt(5);
        System.out.println(g); // generates random numbers from :6,10,14,18,22
        /*calculation
        ********** g = 6 + 4 x 0 = 6 **********
         ********** g = 6 + 4 x 1 = 10 **********
         ********** g = 6 + (4 x 2) = 14 **********/

    }
}
