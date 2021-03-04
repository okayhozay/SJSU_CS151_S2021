package hw3;

public class PartTimeHourly extends Employee
{
	double baseHourlyPay;
	
	public PartTimeHourly()
	{
		
	}
	
	public PartTimeHourly(String firstName, String lastName, Address address, int id, double pay, String ssn)
	{
		super(firstName, lastName, address, id, ssn);
		this.baseHourlyPay = pay;
	}
	
	public double getHourlyPay()
	{
		return this.baseHourlyPay;
	}
	
	public void setHourlyPay(double hp)
	{
		this.baseHourlyPay = hp;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nPart Time Hourly:" + "\nBase Hourly Pay: " + baseHourlyPay;
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
		return baseHourlyPay * numHrs;
	}
}
