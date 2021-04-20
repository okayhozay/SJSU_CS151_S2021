import java.text.DecimalFormat;

public class Circle  extends Shape
{

    private double rad;

    public Circle(double rad) 
    {
        super();
        this.rad = rad;
    }

    public double getRad() 
    {
        return rad;
    }

    public void setRad(double rad) 
    {
        this.rad = rad;
    }

    @Override
    public String toString() 
    {
        return "Circle radius: " + rad;
    }
    
    @Override
    public void computeArea() 
    {
    	//math for area of circles
        double area = Math.PI * rad * rad;
        
        //using decimal format to keep the output organized
        DecimalFormat decimals = new DecimalFormat("#0.000");
        System.out.println("The area of the circle is:    " + decimals.format(area));
        
    }
    
}