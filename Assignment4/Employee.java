
public class Employee
{
	class NumberFormatException extends Exception 
	{
	        
	        public NumberFormatException() 
	        {
	            super("Invalid number format. Please enter a positive number above 0.");
	        }
	        
	        public NumberFormatException(String message) 
	        {
	            super(message);
	        }
	        
	        
	}
	
	class TooManyHoursWorkedException extends Exception 
	{
	        
	        public TooManyHoursWorkedException() 
	        {
	            super("Too many hours worked. Must be less than 40.");
	        }
	        
	        public TooManyHoursWorkedException(String message) 
	        {
	            super(message);
	        }
	        
	        
	}
	
	private String fName, lName, ID;
	private float pay;
	
	public Employee(String theFirstName, String theLastName, String theID, float thePay)
	{
		this.fName = theFirstName;
		this.lName = theLastName;
		this.ID = theID;
		this.pay = thePay;
	}

	public String getfName() 
	{
		return fName;
	}

	public void setfName(String fName) 
	{
		this.fName = fName;
	}

	public String getlName() 
	{
		return lName;
	}

	public void setlName(String lName) 
	{
		this.lName = lName;
	}

	public String getID() 
	{
		return ID;
	}

	public void setID(String iD) 
	{
		ID = iD;
	}

	public double getPay() 
	{
		return pay;
	}

	public void setPay(float pay) 
	{
		this.pay = pay;
	}
	
	public float computePay(int hours) throws NumberFormatException, TooManyHoursWorkedException
	{
		if(hours <= 0)
		{
			throw new NumberFormatException();
		}
		else if(hours > 40)
		{
			throw new TooManyHoursWorkedException();
		}
		
		return hours * pay;
	}
	
}
