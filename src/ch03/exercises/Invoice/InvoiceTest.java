package ch03.exercises.Invoice;

import java.util.Scanner;

public class InvoiceTest {
    public static void main (String[]args){ // starting main method

        Invoice invoice1 = new Invoice("HP500", "Harddisks", 8, 24500);
        Invoice invoice2 = new Invoice("HPz400", "Laptops", 10, 44500);

        System.out.println("The items are: " +
                invoice1.getPartDescription() + " , " + //calling initial values passed in with constructor
                invoice2.getPartDescription());//calling initial values passed in with constructor

        Scanner input = new Scanner(System.in); // calling scanner object

        System.out.print("Enter the first item quantity:"); // user prompt
        int itemQuantity1 = input.nextInt(); // inputted value is saved is assigned to itemQuantity

        System.out.print("Enter the first item price: "); // user prompt
        double itemPrice1 = input.nextDouble(); // value inputted by user is assigned to itemPrice1

        System.out.print("Enter the second item quantity:"); // user prompt
        int itemQuantity2 = input.nextInt(); // inputted value is saved is assigned to itemQuantity

        System.out.print("Enter the second item price: "); // user prompt
        double itemPrice2 = input.nextDouble(); // value inputted by user is assigned to itemPrice1

        // invoice Amount is calculated by calling the getInvoiceAmount method in Account.java
        double firstInvoiceAmount = invoice1.getInvoiceAmount(itemQuantity1,itemPrice1);
        System.out.println("The first invoice amount is : " + firstInvoiceAmount);

        double secondInvoiceAmount = invoice2.getInvoiceAmount(itemQuantity2,itemPrice2);
        System.out.println("The first invoice amount is : " + secondInvoiceAmount);

    } // end main method
} // end class InvoiceTest
