package ch04.Examples;

public class Mystery2 {

    // Exercise 4.25: Mystery2.java

    public static void main(String[] args) {
        int count = 1;


        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        } // end while
    } // end main
} // end class Mystery2

