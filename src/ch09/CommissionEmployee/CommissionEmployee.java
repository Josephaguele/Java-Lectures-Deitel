package ch09.CommissionEmployee; // Fig. 9.4 CommissionEmployee.java
// CommissionEmployee class represents an employee paid a
// percentage of gross sales.
public class CommissionEmployee extends Object
{
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    protected double grossSales; // gross weekly sales
    protected double commissionRate; // commission percentage

    // five-argument constructor
    public CommissionEmployee( String first, String last, String ssn, double sales, double rate)
    {
        // implicit call to object constructor occurs here
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
        setGrossSales(sales); // validate and store gross sales
        setCommissionRate(rate); // validate and store commission rate

    } // end five-argument CommissionEmployee constructor

    // set first name
    public void setFirstName( String first)
    {
        firstName = first; // should validate
    } // end method setFirstName

    // return first name
    public String getFirstName()
    {
        return firstName;
    }// end method getFirstName

    // set last name
    public void setLastName(String last)
    {
        lastName = last; // should validate
    } // end method setLastName

    // return last name
    public String getLastName()
    {
        return lastName;
    } // END Method getLastName

    // set social security number
    public void setSocialSecurityNumber( String ssn)
    {
        socialSecurityNumber = ssn; // should validate
    } // end method setSocialSecurityNumber

    // return social security number
    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    } // end method getSocialSecurityNumber

    /// set gross sales amount
    public void setGrossSales( double sales)
    {
        if ( sales >= 0.00)
            grossSales = sales;
        else
            throw new IllegalArgumentException( " Gross sales must be >= 0.0");

    }// end method setGrossSales

    // return gross sales Amount
    public double getGrossSales()
    {
        return grossSales;
    }// end method getGrossSales

    // set commission rate
    public void setCommissionRate( double rate)
    {
        if (rate > 0.0 && rate < 1.0)
            commissionRate= rate;
        else
            throw new IllegalArgumentException(" Commission rate must be >0.0 and < 1.0");

    } // end method setCommissionRate

    // return commission rate
    public double getCommissionRate()
    {
        return  commissionRate;
    } // end method getCommissionRate

    // calculate earnings
    public double earnings()
    {
        return commissionRate * grossSales;
    } // end method earnings

    // return String representation of CommissionEmployee object
    @Override // indicates that this method overrides a superclass method
    public String toString()
    {
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber,
                "gross sales", grossSales,
                "commission rate", commissionRate);
    } // end method toString
} // end class CommissionEmployee
