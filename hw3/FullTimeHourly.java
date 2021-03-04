package hw3;

public class FullTimeHourly extends FullTimeEmployee
{
	double overtimePay;
	
	public FullTimeHourly()
	{
		
	}
	
	public FullTimeHourly(String firstName, String lastName, Address address, int id, double basePay, double overtime, String ssn)
	{
		super(firstName, lastName, address, id, basePay, ssn);
		this.overtimePay = overtime;
	}

	public double getOvertimePay() 
	{
		return overtimePay;
	}

	public void setOvertimePay(double overtimePay) 
	{
		this.overtimePay = overtimePay;
	}
	
	public String toString()
	{
		 return super.toString() + "\novertime pay: " + overtimePay;
	}
	
	public void introduce(boolean displaySSN)
	{
		if(displaySSN == false)
			this.toString();
		else
			System.out.println(this.toString() + "\nSSN: " + ssn);
	}
	
	public double computePay(int numHrs)
	{
		return (basePay * numHrs) + (overtimePay * numHrs);
	}
	
}
