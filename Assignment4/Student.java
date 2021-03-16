
public class Student implements Cloneable
{
	private String fName, lName, major, department;
	private double gpa;
	private int age;
	private Course course;
	
	
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
	
	public String getMajor() 
	{
		return major;
	}
	
	public void setMajor(String major) 
	{
		this.major = major;
	}
	
	public String getDepartment() 
	{
		return department;
	}
	
	public void setDepartment(String department) 
	{
		this.department = department;
	}
	
	public double getGpa() 
	{
		return gpa;
	}
	
	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public Course getCourse() 
	{
		return course;
	}
	
	public void setCourse(Course course) 
	{
		this.course = course;
	}
	
	
	public void printInfo()
	{
		System.out.println("First Name: " + fName + " Last name: " + lName + " Age: " + age +  " Major: " + major + " Department: " + department + " GPA: " + gpa);
		System.out.println("Course: " + course.getcName() + course.getDepartment() + course.getDescription() + course.getTime() + course.getWeekday() + course.getClass());
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
