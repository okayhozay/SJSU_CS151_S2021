package hw3;

public abstract class Person 
{
	String firstName, lastName, ssn;
	int age;
	Address address;
	
	
	public Person()
	{
		
	}
	
	public Person(String theFN, String theLN, Address theAddress, String theSSN)
	{
		this.firstName = theFN;
		this.lastName = theLN;
		this.address = theAddress;
		//this.age = theAge;
		this.ssn = theSSN;
		//this.address = new Address(address.getStreetNum(),address.getStreetName(),address.getCity(),address.getZip(),address.getState());
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String f)
	{
		this.firstName = f;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String l)
	{
		this.lastName = l;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public String getSSN()
	{
		return this.ssn;
	}
	
	public void setSSN(String s)
	{
		this.ssn = s;
	}
	
	public Address getAddress()
	{
		return this.address;
	}
	
	public void setAddress(Address add)
	{
		this.address = add;
	}
	
	public String toString()
	{
		return "Person:\n" + "firstName: " + firstName + "\nlastName: " + lastName + "\nage: " + age  + "\naddress: " + address;
	}
	
	
}
