package hw3;

public class Customer extends Person
{
	int customerID;
	String payPreference;
	
	public Customer()
	{
		
	}
	
	public Customer(String firstName, String lastName, Address address, int id, String ssn)
	{
		super(firstName,lastName,address, ssn);
		this.customerID = id;
	}
	
	public int getID()
	{
		return this.customerID;
	}
	
	public void setID(int id)
	{
		this.customerID = id;
	}
	
	public String getPayPreference()
	{
		return this.payPreference;
	}
	
	public void setPayPreference(String pp)
	{
		this.payPreference = pp;
	}
	
	@Override
	public String toString()
	{
		 return super.toString() + "\ncustomerId: " + customerID + "\npayPreference: " + payPreference;
	}
	
	public void introduce()
	{
		System.out.println(this.toString());
	}
	
	public void makePayment()
	{
		System.out.println("Would you like to use credit or debit?");
	}
	
	
	
}
