import java.util.ArrayList;
public class ShapeTest 
{
	public static void main(String[] args)
    {
           
		Shapes sps = new Shapes(new ArrayList<Shape>());
		
        Triangle t1 = new Triangle(12.5, 42.6);
        Triangle t2 = new Triangle(8.93, 6.77);
        
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(10.97);
        

        Rectangle r1 = new Rectangle(15.9, 5.99);
        Rectangle r2 = new Rectangle(5.8, 7.2);
     
        Hexagon h1 = new Hexagon(6.66);
        Hexagon h2 = new Hexagon(21.22);
        
        sps.add(t1);
        sps.add(t2);
        
        sps.add(c1);
        sps.add(c2);
        
        sps.add(r1);
        sps.add(r2);
        
        sps.add(h1);
        sps.add(h2);        
        
        System.out.println("Area of the shapes below:");
        Shapes.compute();
                    
    }

}
