package hw2;

public class Whale extends Animal implements Swimmer
{
	//String type_of_animal;
    String name;
    int age;
    String gender;
    String environment;
    double speed;
    
    public Whale(String name, int age, String gender, String environment, double speed) 
    {
        super("Whale", name, age, gender, environment, speed);
    }

	public void swim() 
	{
		// TODO Auto-generated method stub
		System.out.println("Swim");
		
	}
}
