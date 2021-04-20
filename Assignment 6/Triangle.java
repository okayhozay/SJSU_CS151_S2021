import java.text.DecimalFormat;
public class Triangle extends Shape
{
	
    private double height, base;

    public Triangle(double height, double base) 
    {
        super();
        this.height = height;
        this.base = base;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(int base) 
    {
        this.base = base;
    }

    @Override
    public String toString() 
    {
    	return "The height of the triangle is " + height + " and the base of the triangle is " + base;
    }
    
    @Override
    public void computeArea() 
    {       
        //1/2 base * height for triangles
    	
        double area = 0.5* height * base;
        //also using decmial format to keep the output organized
        DecimalFormat decimals = new DecimalFormat("#0.000");
        System.out.println("The area of the triangle is:  " + decimals.format(area));
        //System.out.println(area);
    }
    
}
