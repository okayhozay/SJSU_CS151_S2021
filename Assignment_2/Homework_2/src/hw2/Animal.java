package hw2;

public class Animal 
{
	String type_of_animal;
    String name;
    int age;
    String gender;
    String environment;
    double speed;
    
    public Animal(String tof, String theName, int theAge, String theGender, String tE, double theSpeed)
    {
    	this.type_of_animal = tof;
    	this.name = theName;
    	this.age = theAge;
    	this.gender = theGender;
    	this.environment = tE;
    	this.speed = theSpeed;
    }
    
    
    public String getAnimal()
    {
    	return this.type_of_animal;
    }
    
    public void setAnimal(String theAnimal)
    {
    	this.type_of_animal = theAnimal;
    }
    
    public String getName()
    {
    	return this.name;
    }
    
    public void setName(String tName)
    {
    	this.name = tName;
    }
    
    public int getAge()
    {
    	return this.age;
    }
	
    public void setAge(int tAge)
    {
    	this.age = tAge;
    }
	
    public String getGender()
    {
    	return this.gender;
    }
    
    public void setGender(String tGender)
    {
    	this.gender = tGender;
    }
    
    public String getEnvironment()
    {
    	return this.environment;
    }
    
    public void setEnvironment(String tEnvironment)
    {
    	this.environment = tEnvironment;
    }
    
    public double getSpeed()
    {
    	return this.speed;
    }
    
    public void setSpeed(int tSpeed)
    {
    	this.speed = tSpeed;
    }
    
    
    public void move() 
    {
        System.out.println("Move");
    }
    public void sound() 
    {
    	System.out.println("Sound");
    }
    public void eat() 
    {
    	System.out.println("Eat");
    }
    public void sleep() 
    {
    	System.out.println("Sleep");
    }
    public String toString() 
    {
        return "This is animal "+ this.type_of_animal + " whose name is " +this.name+ " and age is " + this.age + " and is a "+ this.gender+ ". " + (this.gender.equals("male")?"He ":"She ")+"resides in " + this.environment + " and moves with the speed of " + this.speed + " miles per hour.";
    }

}
