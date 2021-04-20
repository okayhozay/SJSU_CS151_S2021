import java.text.DecimalFormat;
public class Hexagon extends Shape
{
	//sl is side length
	private double sl;
	
    public Hexagon(double sl)
    {
        setSL(sl);
    }
    
    public double getSL()
    {
        return sl;
    }
    
    public void setSL(double sl)
    {
        this.sl = sl;
    }
    
    @Override
    public String toString() 
    {
            return "Hexagon sl length = " + sl;
    }
    
    @Override
    public void computeArea() 
    {   
    	//math for area of hexagon
        double area = ((Math.sqrt(3) * 3) / 2) * sl * sl;
        
        //decimal format to keep output organized
        DecimalFormat decimals = new DecimalFormat("#0.000");
        System.out.println("The area of the hexagon is:   " + decimals.format(area));
    }

}
