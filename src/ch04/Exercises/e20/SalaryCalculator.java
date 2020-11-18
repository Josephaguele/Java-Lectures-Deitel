package ch04.Exercises.e20;
/*4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information
for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.*/
import java.util.Scanner;
public class SalaryCalculator
{
    private double hourlyRates; // hourly rate of Employee
    private double hoursWorked; // this is the number of hours worked by the employee
    private String EmployeeName; // This is the name of the Employee
    private double grossPay; // gross Pay of employee which is to be calculated

    public SalaryCalculator()
    {

    }


    // method grossPay to calculate the grossPay of employees
    public void grossPay()
    {
        Scanner input = new Scanner(System.in);

        // USER PROMPT
        System.out.println("Enter your salary hourly Rate: " ); // prompts user to enter hourly salary rate
        hourlyRates = input.nextDouble();

        System.out.print("Enter the number of hours you worked: " ); // user prompt
        hoursWorked = input.nextDouble();

        System.out.print("Enter your employee name: " );
        EmployeeName = input.next();

        if(hoursWorked <= 40)
        {
            grossPay =  hourlyRates * hoursWorked;
            System.out.println("Hi " + EmployeeName + " your Gross Pay is : " + grossPay);
        }
        else if (hoursWorked > 40)
        {
            grossPay = (hourlyRates * hoursWorked) +
                    (0.5 * hourlyRates) * (hoursWorked - 40);

            System.out.println("Hi " + EmployeeName + " your Gross Pay is : " + grossPay);
            System.out.println("Thank you " + EmployeeName + " for going the extra mile.\n" +
                    "We hope to see you soon.");


        }


    }
}
