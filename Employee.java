package hw2;


public class Employee extends Person
{
	
	String status;
	double pay;
	int ID;

	public Employee(String theFName, String theLName, String theAddress, String theGender, int theAge, double theWeight, String theSSN, int theID, String theStatus, double thePay) 
	{
		super(theFName, theLName, theAddress, theGender, theAge, theWeight, theSSN);
		
		this.ID = theID;
		this.status = theStatus;
		this.pay = thePay;
		
	}
	
	public int getID()
	{
		return this.ID;
	}
	
	public void setID(int anID)
	{
		this.ID = anID;
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public void setStatus(String aStatus)
	{
		this.status = aStatus;
	}
	
	public double getPay()
	{
		return this.pay;
	}
	
	public void setPay(int aPay)
	{
		this.pay = aPay;
	}
	
	@Override
	public void introduce()
	{
		//display to command line
		//all their information
		System.out.println("First name: " + this.fName + "| Last name: " + this.lName + "| Address: " + this.address + "| Weight: " + this.weight + "| Age: " + this.age + "| SSN: " + ssn + "| ID: " + ID + "| Status: " + status + "| Pay: " + pay);
	}
	
	public double calculatePay(int units)
	{
		/*example: part time makes 20/hr and works 30 hrs: 20*30 = 600
		example: full time makes 100,000/yr and worked 2 weeks: 100,000 * (1/52) * 2
		this method accepts the number of units worked, checks value of employee status
		and use logic to compute paycheck amount
		
		 part time, full time, contractor
		 
		 contractor/ part time: pay per hour
		 full time: pay per year in weeks
		 
		*/
		
		double totalPay = 0;
		
		if(this.status.equals("Contractor") || this.status == "Part Time")
		{
			totalPay = units * pay;
		}
		else if(this.status.equals("Full Time"))
		{
			totalPay = units * pay / 52;
			totalPay = Math.round(totalPay * 100.0) / 100.0;
		}
		
		
		return totalPay;
	}

}
