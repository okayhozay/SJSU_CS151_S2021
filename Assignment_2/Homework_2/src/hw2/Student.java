package hw2;

public class Student 
{
	String firstName, lastName, major, department;
	int age;
	float GPA;
	
	//constructor
	public Student(String fn, String ln, String mj, String dp, int a, float gradePoint)
	{
		this.firstName = fn;
		this.lastName = ln;
		this.major = mj;
		this.department = dp;
		this.age = a;
		this.GPA = gradePoint;
	}
	
	//setters and getters for all attributes
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String theFirstName)
	{
		this.firstName = theFirstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String theLastName)
	{
		this.lastName = theLastName;
		
	}
	
	public String getMajor()
	{
		return this.major;
	}
	
	public void setMajor(String theMajor)
	{
		this.major = theMajor;
	}
	
	public String getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(String theDepartment)
	{
		this.department = theDepartment;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setAge(int theAge)
	{
		this.age = theAge;
	}
	
	public float getGPA()
	{
		return this.GPA;
	}
	
	public void setGPA(float theGPA)
	{
		this.GPA = theGPA;
	}
	
	
	//nested inner class
	class Course
	{
		//explore static final variables in java
		
		public void printSchedule()
		{
			String schedule = "CS-151 Mon/Wed 6-7:15PM\nMath-161A Tue/Thur 4:30-5:45PM\nCS-122 Mon/Wed 3-4:15PM";
			
			System.out.println(schedule);
		}
		
		
	}
	
}
