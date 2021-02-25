package hw2;

public class EmployeeTest 
{
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Joe", "Smith", "2498 Barn Way", "male", 28, 200, "210-57-8889", 10983445, "Contractor", 60);
		Employee e2 = new Employee("Lisa", "Gray", "3245 Simp Rd", "female", 32, 140, "325-43-1234", 22948485, "Full Time", 110000);
		Employee e3 = new Employee("Timothy", "Briggs", "24589 Cat Lane", "male", 27, 170, "6437-34-8967", 22435354, "Full Time", 80000);
		Employee e4 = new Employee("George", "Wallace", "234 Box Rd", "male", 25, 160, "123-23-1231", 12084454, "Part Time", 20);
		Employee e5 = new Employee("Amy", "Student", "134 Lod CT", "female", 24, 150, "234-99-0008", 6788764, "Contractor", 45);
		
		
		
		
		e1.introduce();
		System.out.println("Total pay for this period = " + e1.calculatePay(30));
		System.out.println();
		
		e2.introduce();
		System.out.println("Total pay for this period = " + e2.calculatePay(2));
		System.out.println();
		
		e3.introduce();
		System.out.println("Total pay for this period = " + e3.calculatePay(4));
		System.out.println();
		
		e4.introduce();
		System.out.println("Total pay for this period = " + e4.calculatePay(25));
		System.out.println();
		
		e5.introduce();
		System.out.println("Total pay for this period = " + e5.calculatePay(45));
		
		
	}

	
}
