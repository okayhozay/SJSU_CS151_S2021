
public class Course implements Cloneable
{
	private String cName, description, department, time, weekday;
	
	public Course(String theName, String theDescription, String theDepartment, String theTime, String theWeekday)

	{
		this.cName = theName;
		this.description = theDescription;
		this.department = theDepartment;
		this.time = theTime;
		this.weekday = theWeekday;
	}

	public String getcName() 
	{
		return cName;
	}

	public void setcName(String cName) 
	{
		this.cName = cName;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getDepartment() 
	{
		return department;
	}

	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getTime() 
	{
		return time;
	}

	public void setTime(String time) 
	{
		this.time = time;
	}

	public String getWeekday() 
	{
		return weekday;
	}

	public void setWeekday(String weekday) 
	{
		this.weekday = weekday;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
