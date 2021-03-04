package hw3;

public class Executive extends Employee 
{
	double yearlyBonus, yearlyCompensation;
	
	public Executive()
	{
		
	}
	
	public Executive(String firstName, String lastName, Address address, int id, double yB, double yC, String ssn)
	{
		super(firstName, ssn, address, id, ssn);
		this.yearlyBonus = yB;
		this.yearlyCompensation = yC;
	}
	
	public double getBonus()
	{
		return this.yearlyBonus;
	}
	
	public void setBonus(double b)
	{
		this.yearlyBonus = b;
	}
	
	public double getCompensation()
	{
		return this.yearlyCompensation;
	}
	
	public void setCompensation(double c)
	{
		this.yearlyCompensation = c;
	}
	
	public String toString()
	{
		return super.toString() + "\nYearly Bonus: " + yearlyBonus + "\nYearly Compensation: " + yearlyCompensation; 
	}
	
	public void introduce(boolean displaySSN)
	{
		if(displaySSN == false)
			this.toString();
		else
			System.out.println(this.toString() + "\nSSN:" + ssn);
		
	}
	
	public double computePay()
	{
		return yearlyBonus + yearlyCompensation;
	}

}
