package hw3;

public abstract class FullTimeEmployee extends Employee
{
	double basePay;
	
	public FullTimeEmployee()
	{
		
	}
	
	public FullTimeEmployee(String firstName, String lastName, Address address, int id, double basePay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		this.basePay = basePay;
	}

	public double getBasePay() 
	{
		return basePay;
	}

	public void setBasePay(double basePay) 
	{
		this.basePay = basePay;
	}
	
	
	public String toString()
	{
		return super.toString()+ "\nFull Time Employee: " + "\nbase pay: " + basePay;
	}
	
	
}
