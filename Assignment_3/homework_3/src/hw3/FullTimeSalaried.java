package hw3;

public class FullTimeSalaried extends FullTimeEmployee
{
	
	public FullTimeSalaried()
	{
		
	}
	
	public FullTimeSalaried(String firstName, String lastName, Address address, int id, double salary, String ssn)
	{
		super(firstName, ssn, address, id, salary, ssn);
		//typo in hw?
	}
	
	public String toString()
	{
		return super.toString() + "\nFull Time Salaried: " + this.getBasePay();
	}
	
	public void introduce(boolean displaySSN)
	{
		if(displaySSN == false)
			System.out.println(this.toString());
		else
			System.out.println(this.toString() + "\nSSN: " + this.getSSN());
	}
	
	public double computePay(int numWeeks)
	{
		return (this.getBasePay() * numWeeks /52);
	}
}
