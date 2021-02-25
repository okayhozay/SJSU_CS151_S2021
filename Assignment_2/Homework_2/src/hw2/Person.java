package hw2;

public class Person 
{
	String fName, lName, address, gender, ssn;
	int age;
	double weight;
	
	public Person(String theFName, String theLName, String theAddress, String theGender, int theAge, double theWeight, String theSSN)
	{
		this.fName = theFName;
		this.lName = theLName;
		this.address = theAddress;
		this.gender = theGender;
		this.age = theAge;
		this.weight = theWeight;
		this.ssn = theSSN;
	}
	
	public String getFirstName()
	{
		return this.fName;
	}
	
	public void setFirstName(String fn)
	{
		this.fName = fn;
	}
	
	public String getLastName()
	{
		return this.lName;
	}
	
	public void setLastName(String ln)
	{
		this.lName = ln;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String ad)
	{
		this.address = ad;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void setGender(String gd)
	{
		this.gender = gd;
	}

	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public void setWeight(float wt)
	{
		this.weight = wt;
	}
	
	public String getSSN()
	{
		return this.ssn;
	}
	
	public void setSSN(String theSsn)
	{
		this.ssn = theSsn;
	}
	
	@Override
	public String toString()
	{
		return ("First name: " + this.fName + "| Last name: " + this.lName + "| Address: " + this.address + "| Weight: " + this.weight + "| Age: " + this.age + "| SSN: " + ssn);
	}
	
	public void introduce()
	{
		this.toString();
	}
	
	
}
