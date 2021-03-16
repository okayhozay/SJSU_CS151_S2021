
public class StudentTest 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{		
		Course c1 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00pm", "Tue");

		Student s1 = new Student();
		s1.setAge(20);
		s1.setfName("John");
		s1.setlName("Smith");
		s1.setMajor("Computer Science major");
		s1.setDepartment("School of Computer Science");
		s1.setGpa(3.6);
		s1.setCourse(c1);
		
		Student dc2 = (Student)s1.clone();
		
		s1.printInfo();
		
		dc2.printInfo();
	}
}
