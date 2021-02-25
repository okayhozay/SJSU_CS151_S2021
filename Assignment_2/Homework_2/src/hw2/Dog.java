package hw2;

public class Dog extends Animal implements Domesticated
{
	//String type_of_animal;
    String name;
    int age;
    String gender;
    String environment;
    double speed;
    
    public Dog(String name, int age, String gender, String environment, double speed) 
    {
        super("Dog", name, age, gender, environment, speed);
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
	
	public void bark()
	{
		System.out.println("Bark");
	}
}
