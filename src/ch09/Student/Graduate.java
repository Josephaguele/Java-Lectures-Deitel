package ch09.Student;

public class Graduate extends Student
{
    private String graduateCollege;

    public Graduate(String fName, String lName, String dept, int studentAge, int studentGrade, String sName, String college)
    {
        super(fName, lName, dept, studentAge, studentGrade, sName);
        graduateCollege = college;
    }

    public String getGraduateCollege() {
        return graduateCollege;
    }

    public void setGraduateCollege(String college) {
        graduateCollege = college;
    }
}
