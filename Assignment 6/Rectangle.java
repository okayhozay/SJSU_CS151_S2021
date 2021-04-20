import java.text.DecimalFormat;
public class Rectangle extends Shape
{
	private double length, width;
    
    // parameterized constructor method
    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }
    
    // getter and setter methods
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public void setLength(double length)
    {
        this.length = length;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    @Override
    public String toString() 
    {
    	return "Rectangle length = " + length + ", width = " + width;
    }
    
    @Override
    public void computeArea() 
    {
    	//math for area of rectangle
        double area = length * width;
        
        //using decimal format to keep the output organized
        DecimalFormat decimals = new DecimalFormat("#0.000");
        System.out.println("The area of the rectangle is: " + decimals.format(area));
        
        //System.out.println(area);
    }

}
