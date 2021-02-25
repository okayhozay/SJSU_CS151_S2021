package hw2;

public class AnimalTest 
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog("Bill", 7, "male", "House", 20);
		Cat c2 = new Cat("Larry", 4, "male", "House", 25);
		Racoon r3 = new Racoon("Jim", 2, "male", "gutter", 10);
		Whale w4 = new Whale("Rajeshvari", 5, "female", "ocean", 1000);
		
		
		System.out.println(d1.toString());
		d1.bark();
		d1.move();
		d1.sleep();
		
		System.out.println(c2.toString());
		c2.scratch();
		c2.greetHuman();
		
		System.out.println(r3.toString());
		r3.scratch();

		System.out.println(w4.toString());
		w4.swim();
		
	}
	
}
