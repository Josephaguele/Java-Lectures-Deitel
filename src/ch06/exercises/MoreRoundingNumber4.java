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
///**************************VERSION 3**************************************************
public class MoreRoundingNumber4 {

     public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
         double number = sc.nextDouble();

         //OUTPUT
        System.out.println("The number inputted is : \t " +number);
         System.out.println("Rounding to the nearest integer:" + roundToInteger(number));
         System.out.println("Rounding to the nearest tenths: " +roundToTenths(number));
         System.out.println("Rounding to the nearest hundredths: "+ roundToHundredths(number));
         System.out.println("Rounding to the nearest thousandths: " +roundToThousands(number));
    }

    static double roundToInteger(double no){ // round to integer
        int y1 = (int) Math.floor(no + 0.5);
               return y1;
    }

    static double roundToTenths(double no){ // round to tenths
        int y1 = (int) Math.floor(no + 0.5) / 10 ;
        return y1;
    }

    static double roundToHundredths(double no){ // round to hundredths
        int y1 = (int) Math.floor(no + 0.5) / 100;
        return y1;
    }

    static double roundToThousands(double no){ // round to thousandths
        int y1 = (int) Math.floor(no + 0.5) / 1000;
        return y1;
    }
}