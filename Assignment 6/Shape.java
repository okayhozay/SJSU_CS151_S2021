public class Shape extends Thread
{

    //default constructor
    Shape()
    {
    	
    }
    
    //thread run method
    public void run()
    {
    	//call computeArea
    	try {
            computeArea();
    	}
    	catch (Exception e) 
    	{
    		System.out.println(e);
    	}
    }
    
    public void computeArea()
    {
    	
    }
        
}