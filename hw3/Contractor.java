package hw3;

public class Contractor extends Employee
{
	double basePay;
	
	public Contractor()
	{
		
	}
	
	public Contractor(String firstName, String lastName, Address address, int id, double pay, String ssn)
	{
		super(firstName,lastName, address, id,ssn);
		this.basePay = pay;
	}
	
	public double getBasePay()
	{
		return this.basePay;
	}
	
	public void setBasePay(double bp)
	{
		this.basePay = bp;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nbasePay: " + basePay;
	}
	
	public void introduce(boolean displaySSN)
	{
		if(displaySSN == false)
			this.toString();
		else
			System.out.println(this.toString() + "\nSSN: " + this.getSSN());
	}
	
	public double computePay(int numHrs)
	{
		return basePay * numHrs;
	}
}
