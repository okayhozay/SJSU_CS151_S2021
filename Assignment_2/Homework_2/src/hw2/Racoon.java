package hw2;

public class Racoon extends Animal implements Scratcher
{
	//String type_of_animal;
    String name;
    int age;
    String gender;
    String environment;
    double speed;
    
    public Racoon(String name, int age, String gender, String environment, double speed) 
    {
        super("Racoon", name, age, gender, environment, speed);
    }

	public void scratch() 
	{
		// TODO Auto-generated method stub
		System.out.println("Scratch");
	}
}
