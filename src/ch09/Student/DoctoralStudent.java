package ch09.Student;

public class DoctoralStudent extends Graduate
{
    private String specialization;


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public DoctoralStudent(String fName, String lName, String dept, int studentAge, int studentGrade, String sName, String college, String specialty)
    {
        super(fName, lName, dept, studentAge, studentGrade, sName, college);
        specialization = specialty;

    }
}
