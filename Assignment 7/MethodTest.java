import java.util.ArrayList;
public class MethodTest 
{
	
	private static <T> void count(T obj)
	{
		System.out.println(((ArrayList<T>) obj).size());	
	}

	
	
	public static void main(String[] args)
	{
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("Hello");
		s1.add("there");
		s1.add("General");
		s1.add("Kenobi");
		s1.add("lol");
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(11);
		i1.add(22);
		i1.add(33);
		i1.add(44);
		i1.add(55);
		i1.add(66);
		
		ArrayList<Double> d1 = new ArrayList<Double>();
		d1.add(10.5);
		d1.add(33.333);
		d1.add(65.8);
		d1.add(1124.6);
		d1.add(1.533);
		d1.add(3.5);
		d1.add(7.5);
		d1.add(4.5);
		
		
		count(s1);
		count(i1);
		count(d1);
		
	}
}
