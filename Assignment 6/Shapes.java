
import java.util.ArrayList;

public class Shapes 
{
    private static ArrayList<Shape> shapeArray = new ArrayList<Shape>();
    
    public Shapes(ArrayList<Shape> shapeArray) 
    {
        this.shapeArray = shapeArray;
    }
    
    
    public ArrayList<Shape> getShapeArray() 
    {
        return shapeArray;
    }

    public void setShapeArray(ArrayList<Shape> shapeArray) 
    {
        this.shapeArray = shapeArray;
    }


    public void add(Shape a) 
    {
        shapeArray.add(a);
    }
    
    public void remove(Shape r) 
    {
        shapeArray.remove(r);
    }
    
    public synchronized static void compute() 
    {
    	//enhanced for loop
        for(Shape s : shapeArray)
        {
            // starts the thread
            s.start();
        }    
    }  
}