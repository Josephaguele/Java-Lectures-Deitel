package ch06.exercises;
import java.util.Scanner;
/*6.10 (Rounding Numbers) To round numbers to specific decimal places, use a statement like
y = Math.floor( x * 10 + 0.5 ) / 10;
which rounds x to the tenths position (i.e., the first position to the right of the decimal point), or
y = Math.floor( x * 100 + 0.5 ) / 100;
which rounds x to the hundredths position (i.e., the second position to the right of the decimal
point). Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger( number )
b) roundToTenths( number )
c) roundToHundredths( number )
d) roundToThousandths( number )
For each value read, your program should display the original value, the number rounded to the
nearest integer, the number rounded to the nearest tenth, the number rounded to the nearest hundredth
and the number rounded to the nearest thousandth.*/
//********************************VERSION 1 ******************************************************
public class MoreRoundingNumber1 {

    private static double number; // number to be inputted by user

    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
         number = sc.nextDouble();

         //OUTPUT
        System.out.println("The number inputted is : \t " +number);
         roundToInteger();
         roundToTenths();
         roundToHundredths();
         roundToThousands();
    }

    static void roundToInteger(){ // round to integer
        int y1 = (int) Math.floor(number + 0.5);
        System.out.println("Rounding to the nearest integer : " + y1 );
    }

    static void roundToTenths(){ // round to tenths
        int y1 = (int) Math.floor(number + 0.5) / 10 ;
        System.out.println("Rounding to the nearest tenths : " + y1 );
    }

    static void roundToHundredths(){ // round to hundredths
        int y1 = (int) Math.floor(number + 0.5) / 100;
        System.out.println("Rounding to the nearest hundredths : " + y1 );
    }

    static void roundToThousands(){ // round to thousandths
        int y1 = (int) Math.floor(number + 0.5) / 1000;
        System.out.println("Rounding to the nearest thousands : " + y1 );
    }
}