package ch09.Student;

import java.awt.*;

public class MastersStudent extends Graduate
{
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public MastersStudent(String fName, String lName, String dept, int studentAge, int studentGrade, String sName, String college, String course)
    {
        super(fName, lName, dept, studentAge, studentGrade, sName, college);
        courseName = course;

    }
}
