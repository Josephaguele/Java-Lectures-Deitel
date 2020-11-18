package ch04.Exercises.e38;

import java.util.Scanner;

/*4.38 (Enforcing Privacy with Cryptography) The explosive growth of Internet communications
and data storage on Internet-connected computers has greatly increased privacy concerns. The field
of cryptography is concerned with coding data to make it difficult (and hopefully—with the most
advanced schemes—impossible) for unauthorized users to read. In this exercise you’ll investigate a
simple scheme for encrypting and decrypting data. A company that wants to send data over the Internet
has asked you to write a program that will encrypt it so that it may be transmitted more securely.
All the data is transmitted as four-digit integers. Your application should read a four-digit
integer entered by the user and encrypt it as follows: Replace each digit with the result of adding 7
to the digit and getting the remainder after dividing the new value by 10. Then swap the first digit
with the third, and swap the second digit with the fourth. Then print the encrypted integer. Write
a separate application that inputs an encrypted four-digit integer and decrypts it (by reversing the
encryption scheme) to form the original number. [Optional reading project: Research “public key
cryptography” in general and the PGP (Pretty Good Privacy) specific public key scheme. You may
also want to investigate the RSA scheme, which is widely used in industrial-strength applications.]*/
public class Cryptography
{
    public Cryptography(){}

    // Method used for encrypting the data inputted by the user.
    /*This method does the following:
    * reads a 4 digit inputted by the user
    * replaces each digit with the result of adding 7 to the digit
    * and gets  the remainder after dividing the new value by 10
    * swaps 1st digit with 3rd
    * swaps 2nd digit with 4th
    * And prints the encrypted output*/
    public void encryption()
    {
        // Receiving and reading user input
        Scanner userInput = new Scanner(System.in); // calling Scanner object
        System.out.print("Enter any digit integer to be encrypted: ");
        String number = userInput.next();

        // splitting the numbers entered as separate numbers
        String n1 = number.substring(0,1);
        String n2 = number.substring(1,2);
        String n3 = number.substring(2,3);
        String n4 = number.substring(3,4);

        // converting splitted numbers to primitive type int
        int firstDigit = Integer.parseInt(n1);
        int secondDigit = Integer.parseInt(n2);
        int thirdDigit = Integer.parseInt(n3);
        int fourthDigit = Integer.parseInt(n4);

        // Adding 7 to each digit
        firstDigit  = firstDigit    + 7;
        secondDigit = secondDigit   + 7;
        thirdDigit  = thirdDigit    + 7;
        fourthDigit = fourthDigit   + 7;


        // divide each variable by 10 and get the remainder in each variable division
        firstDigit  = firstDigit%10;
        secondDigit = secondDigit%10;
        thirdDigit  = thirdDigit%10;
        fourthDigit = fourthDigit%10;

        // printing the output in swapped positions
        /* swap 1st number with 3rd
        * swap 2nd number with 4th*/
        System.out.println("The encrypted number is: " +thirdDigit+""+fourthDigit+""+firstDigit+""+secondDigit);
    } // end of method encryption
    
    
    // Method used for decrypting the data inputted by the user
    /* Reads a 4 digit number
    * Save user input as a string variable
    * Split integers inot 4 separate numbers
    * Swap 1st digit with 3rd, 2nd digit with 4th
    * Add 10 to all numbers
    * Subtract seven from numbers
    * Print output*/
    public void decryption()
    {
        // Receiving and reading user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 4 digits code to be decrypted: ");
        String number = input.nextLine(); // assigning user input to number
        
        // Splitting integers entered to 4 separate numbers
        String n1 = number.substring(0,1);
        String n2 = number.substring(1,2);
        String n3 = number.substring(2,3);
        String n4 = number.substring(3,4);

        // converting splitted string numbers to integers
        int firstDigit = Integer.parseInt(n1);
        int secondDigit = Integer.parseInt(n2);
        int thirdDigit = Integer.parseInt(n3);
        int fourthDigit = Integer.parseInt(n4);
        
        // Adding 10 to each number
        firstDigit  = firstDigit    + 10;
        secondDigit = secondDigit   + 10;
        thirdDigit  = thirdDigit    + 10;
        fourthDigit = fourthDigit   + 10;

        // Subtracting 7 from each digit
        firstDigit  = firstDigit    - 7;
        secondDigit = secondDigit   - 7;
        thirdDigit  = thirdDigit    - 7;
        fourthDigit = fourthDigit   - 7;

        //OUTPUT SECTION
        // Swwap 1st digit with the 3rd digit and
        // Swap 2nd digit with the 4th digit
        System.out.println("The encrypted number is: " +thirdDigit+""+fourthDigit+""+firstDigit+""+secondDigit);
    }// end method decryption
}
