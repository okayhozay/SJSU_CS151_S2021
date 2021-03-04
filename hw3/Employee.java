package hw3;

public abstract class Employee extends Person
{
	int id;
	String educationLevel;
	boolean directDeposit;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName,lastName,address,ssn);
		this.id = id;
	}
	
	public int getID()
	{
		return this.id;
	}
	
	public void setID(int i)
	{
		this.id = i;
	}

	public String getEducation()
	{
		return this.educationLevel;
	}
	
	public void setEducation(String ed)
	{
		this.educationLevel = ed;
	}
	
	public boolean getDirectDeposit()
	{
		return this.directDeposit;
	}
	
	public void setDirectDeposit(boolean dd)
	{
		this.directDeposit = dd;
	}
	
	
	public String toString()
	{
		 return super.toString()+ "\nEmployee: " + "id: " + id + "\neducationLevel: " + educationLevel + "\ndirectDeposit=" + directDeposit;
	}
	
}
