package hw3;

public class Address 
{
	int streetNum;
	String streetName, city, zip, state;
	
	public Address(int sn, String theSN, String theCity, String theZip, String theState)
	{
		this.streetNum = sn;
		this.streetName = theSN;
		this.city = theCity;
		this.state = theState;
		this.zip = theZip;
		
	}
	
	public int getStreetNum()
	{
		return this.streetNum;
	}
	
	public void setStreetNum(int gg)
	{
		this.streetNum = gg;
	}
	
	public String getStreetName()
	{
		return this.streetName;
	}
	
	public void setStreetName(String tsn)
	{
		this.streetName = tsn;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public void setCity(String c)
	{
		this.city = c;
	}
	
	public String getZip()
	{
		return this.zip;
	}
	
	public void setZip(String z)
	{
		this.zip = z;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public void setState(String s)
	{
		this.state = s;
	}
	
	@Override
	public String toString()
	{
		 return "\n" + "streetNum: " + streetNum +"\nstreetName: " + streetName +"\ncity: " + city +"\nzip: " + zip +"\nstate: " + state;
	}
	
}
