package hw3;

public class BusinessTest 
{
//	Person person;
//    public BusinessTest(Person p) 
//    {
//    	this.person = p;
//    }
    
	
	public static void main(String[] args)
	{
		Address syedAddress = new Address(32245, "Cat Dr", "San Jose", "96503", "California");
		Customer syed = new Customer("Syed", "Ali", syedAddress, 982342, "123-12-1234");
		syed.introduce();
		syed.makePayment();
		System.out.println("\n");
		
		Address markAddress = new Address(11245, "Bart Dr", "Fremont", "94599", "California");
		Customer mark = new Customer("Mark", "lol", markAddress, 324545, "823-12-1234");
		mark.introduce();
		mark.makePayment();
		System.out.println("------------------------------------------------------");
		
		Address ftSalary = new Address(22445, "Dog Dr", "San Jose", "96503", "California");
		FullTimeSalaried jacob = new FullTimeSalaried("Jacob", "Marx", ftSalary, 8676832, 12000, "123-12-1236");
		jacob.introduce(true);
		System.out.println("PAY: "+jacob.computePay(8));
		System.out.println("------------------------------------------------------");
		
		Address ftSalary2 = new Address(72445, "haha dr", "Fremont", "94599", "California");
		FullTimeSalaried betty = new FullTimeSalaried("Betty", "hansen", ftSalary2, 2346234, 8000, "127-12-1236");
		betty.introduce(true);
		System.out.println("PAY: " + betty.computePay(2));
		System.out.println("------------------------------------------------------");
		
		Address contractor1 = new Address(57486, "meow road", "Livermore", "93843", "California");
		Contractor james = new Contractor("James", "Logan", contractor1, 765675, 3000, "567-99-0001");
		james.introduce(true);
		System.out.println("PAY: " + james.computePay(20));
		System.out.println("------------------------------------------------------");
		
		Address contractor2 = new Address(2345, "Hat road", "Livermore", "93843", "California");
		Contractor charles = new Contractor("Charles", "Logan", contractor2, 765225, 100, "567-99-9991");
		charles.introduce(true);
		System.out.println("PAY: " + charles.computePay(30));
		System.out.println("------------------------------------------------------");
		
		Address executive1 = new Address(7908, "Well Dr", "Hayward", "93843", "California");
		Executive happy = new Executive("happy", "boy", executive1, 765675, 5000, 60000, "333-99-0001");
		happy.introduce(true);
		System.out.println(happy.computePay());
		System.out.println("------------------------------------------------------");
		
		Address executive2 = new Address(89762, "LOL Dr", "San Ramon", "98757", "California");
		Executive bobby = new Executive("Bobby", "JR", executive2, 23467, 8000, 90000, "333-99-6666");
		bobby.introduce(true);
		System.out.println("PAY +" + bobby.computePay());
		System.out.println("------------------------------------------------------");
		
		Address ftHOURLY1 = new Address(209846, "hippy Dr", "San Francisco", "95777", "California");
		FullTimeHourly joob = new FullTimeHourly("happy", "boy", ftHOURLY1, 9876837, 20, 30, "333-99-0001");
		joob.introduce(true);
		System.out.println("PAY: " + joob.computePay(30));
		System.out.println("------------------------------------------------------");
		
		Address ftHOURLY2 = new Address(2012459846, "Watson Dr", "Boom", "87456", "Illinois");
		FullTimeHourly goomba = new FullTimeHourly("Mario", "Lox", ftHOURLY2, 124515, 30, 40, "888-99-0001");
		goomba.introduce(true);
		System.out.println("PAY: " + goomba.computePay(50));
		System.out.println("------------------------------------------------------");
		
		
		Address ptHourly1 = new Address(12356, "Home Dr", "Los Gatos", "13333", "California");
		PartTimeHourly lemon = new PartTimeHourly("Lemon", "Drop", ptHourly1, 2352633, 200, "999-99-9999");
		lemon.introduce(true);
		System.out.println("PAY: " + lemon.computePay(30));
		System.out.println("------------------------------------------------------");
		
		Address ptHourly2 = new Address(35742, "Lemon Dr", "Los Gatos", "13333", "California");
		PartTimeHourly candy = new PartTimeHourly("Candy", "Land", ptHourly2, 1234253, 100, "666-66-6666");
		candy.introduce(true);
		System.out.println("PAY: " + candy.computePay(50));
		System.out.println("------------------------------------------------------");
		
		
	}
    
}
