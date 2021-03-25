import java.util.*;
public class Student 
{
	String fName, lName, major, department;
	int age;
	float gpa;
	LinkedList<Course> courses;
	
	public Student(String fn, String ln, String mj, String dp, LinkedList<Course> cs, int a, float theGPA)
	{
		this.fName = fn;
		this.lName = ln;
		this.major = mj;
		this.department = dp;
		this.courses = cs;
		this.age = a;
		this.gpa = theGPA;
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

	public LinkedList<Course> getCourses() 
	{
		return courses;
	}

	public void setCourses(LinkedList<Course> courses) 
	{
		this.courses = courses;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public float getGpa() 
	{
		return gpa;
	}

	public void setGpa(float gpa) 
	{
		this.gpa = gpa;
	}
	
	public void addCourse(Course new_course)
	{
		this.courses.add(new_course);
	}
	
	public void removeCourse()
	{
		this.courses.removeLast();
	}
	
	public void sortCourses(String attribute, boolean descending) 
	{
	    HashMap<String, Integer> courseMap = new HashMap<String, Integer>();
	    courseMap.put("Sunday", 0);
	    courseMap.put("Monday", 1);
	    courseMap.put("Tuesday", 2);
	    courseMap.put("Wednesday", 3);
	    courseMap.put("Thursday", 4);
	    courseMap.put("Friday", 5);
	    courseMap.put("Saturday", 6);
	                 
	        // define how to sort the linked list by overriding the compare() method
	    Collections.sort(courses, new Comparator<Course>() 
	    {
	        @Override
	        public int compare(Course a, Course b) 
	        {
	            // sorting depending on the attribute specified
                switch(attribute) 
                {
                    case "name":
                            return a.getcName().compareTo(b.getcName());
                    case "department":
                            return a.getDepartment().compareTo(b.getDepartment());
                    case "time":
                            return a.getTime().compareTo(b.getTime());
                    case "day":
                            return (courseMap.get(a.getWeekday()) - courseMap.get(b.getWeekday()));
                        default:
                        	return a.getcName().compareTo(b.getcName());
                }
	        }
	    });
	    
            if(descending) 
            {
            	Collections.reverse(courses);
            }

            for(Course i : courses)
            {
            	System.out.println(i);
            }
	}

}
