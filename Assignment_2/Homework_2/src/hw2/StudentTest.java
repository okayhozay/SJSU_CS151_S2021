package hw2;

public class StudentTest 
{
	
	public static void main(String []args)
	{
		
		Student test = new Student("John","Smith","Computer Science major", "School of Computer Science department", 20, (float)3.6);
		
		Student.Course newTest = test.new Course();
		
		newTest.printSchedule();
	}
	
	
}
