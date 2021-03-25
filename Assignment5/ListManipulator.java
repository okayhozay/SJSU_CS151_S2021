import java.util.*;
public class ListManipulator 
{
	ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean ascending) 
	{
        ArrayList<Integer> list = (ArrayList<Integer>) myLst.clone();
        
        if(ascending)
        	Collections.sort(list);
        else 
        	Collections.sort(list, Collections.reverseOrder());
        return list;
	}

	ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> myLst) 
	{
	        ArrayList<Integer> list = (ArrayList<Integer>) myLst.clone();
	        int min = 0;
	        int max = 0;
	        for(int i=0 ; i<list.size() ; i++) 
	        {
	                if(list.get(i) > list.get(max))
	                {
	                        max = i;
	                }
	                if(list.get(i) < list.get(min))
	                {
	                        min = i;
	                }
	        }
	        
	        int mm = list.get(min);
	        int lmx = list.get(max);
	        
	        list.set(min, lmx); list.set(max, mm); 
	       
	        return list;
	}

	void table(ArrayList<Integer> myLst) 
	{
	        HashMap<Integer, Integer> fq = new HashMap<>();
	        for(int i=0 ; i<myLst.size() ; i++) 
	        {
	                if(!fq.containsKey(myLst.get(i))) 
	                {
	                	fq.put(myLst.get(i), 1);
	                } 
	                else 
	                {
	                	fq.put(myLst.get(i), fq.get(myLst.get(i))+1);
	                }
	        }

	}
}