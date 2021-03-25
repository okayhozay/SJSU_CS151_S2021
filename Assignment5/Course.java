
public class Course 
{
	String cName, description, department, time, weekday;
	
	public Course(String n, String desc, String dp, String t, String day)
	{
		this.cName = n;
		this.description = desc;
		this.department = dp;
		this.time = t;
		this.weekday = day;
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
	
	

}
