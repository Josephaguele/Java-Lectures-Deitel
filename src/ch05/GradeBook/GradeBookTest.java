package ch05.GradeBook;// GradeBookTest.java
// Create GradeBook object, input grades and display grade report.

public class GradeBookTest
{
    public static void main(String[]args)
    {
        // create GradeBook object myGradeBook and
        // pass course name to constructor
        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java programming");

        myGradeBook.displayMessage(); // DISPLAY WELCOME MESSAGE
        myGradeBook.inputGrades();// read grades from user
        myGradeBook.displayGradeReport(); // display report based on grades
    } // end main
}// end class GradeBookTest
