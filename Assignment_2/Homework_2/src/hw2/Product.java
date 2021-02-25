package hw2;

public final class Product 
{
	private final String pName, pDescription;
	private final double price;
	private final int quantity;
	
	public Product(String theName, String theDescription, double thePrice, int theQuantity)
	{
		this.pName = theName;
		this.pDescription = theDescription;
		this.price = thePrice;
		this.quantity = theQuantity;
	}
	
	
	public String getName()
	{
		return this.pName;
	}
	
	public String getDescription()
	{
		return this.pDescription;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	
	@Override
	public String toString()
	{
		return ("Product name: " + pName + "| Product description: " + pDescription + "| Price: " + price + "| Quantity: " + quantity);
	}
	
}
