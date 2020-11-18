package ch09.Student;

public class Undergraduate extends Student
{
    private String faculty;

    public Undergraduate(String fName, String lName, String dept, int studentAge, int studentGrade, String sName, String faculty) {
        super(fName, lName, dept, studentAge, studentGrade, sName);
        this.faculty = faculty;
    }
}
