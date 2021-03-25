
public class Person 
{
	String fName, lName;
	int age;
	
	public Person()
	{
		
	}
	
	public Person(String fn ,String ln, int theAge)
	{
		this.fName = fn;
		this.lName = ln;
		this.age = theAge;
	}

	public String getfName() 
	{
		return fName;
	}

	public void setfName(String fName) 
	{
		this.fName = fName;
	}

	public String getlName() 
	{
		return lName;
	}

	public void setlName(String lName) 
	{
		this.lName = lName;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	

}
