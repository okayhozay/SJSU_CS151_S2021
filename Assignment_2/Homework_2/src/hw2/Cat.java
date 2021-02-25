package hw2;

public class Cat extends Animal implements Scratcher, Domesticated
{
	//String type_of_animal;
    String name;
    int age;
    String gender;
    String environment;
    double speed;
    
    public Cat(String name, int age, String gender, String environment, double speed) 
    {
        super("Cat", name, age, gender, environment, speed);
    }

	public void scratch() 
	{
		// TODO Auto-generated method stub
		System.out.println("Scratch");
		
	}

	public void walk() 
	{
		// TODO Auto-generated method stub
		System.out.println("Walk");
	}

	public void greetHuman() 
	{
		// TODO Auto-generated method stub
		System.out.println("Greet human");

	}
}
