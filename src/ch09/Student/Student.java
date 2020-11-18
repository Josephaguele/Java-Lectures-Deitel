package ch09.Student;

public class Student
{
    private String firstName;
    private String lastName;
    private String department;
    private int age;
    private int grade;
    private String supervisorName;

    public Student(String fName, String lName, String dept, int studentAge, int studentGrade, String sName)
    {
        firstName = fName;
        lastName = lName;
        department = dept;
        age = studentAge;
        grade = studentGrade;
        supervisorName = sName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        lastName = last;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String dept) {
        department = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int studentGrade) {
        grade = studentGrade;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisor) {
        supervisorName = supervisor;
    }
}
