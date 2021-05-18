import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class ReflectionTest 
{
	public static void main(String[] args) 
	{
       Class<Person> A = Person.class;
       Method m1[]= A.getDeclaredMethods();
     
       System.out.println("START OF PART 1");
       for(Method M : m1) 
       {
           System.out.println("This declared method for class PERSON is: " + M.toString());
          
           Parameter parameter[] = M.getParameters();
           for(Parameter p : parameter) 
           {
               System.out.println("Number of Parameters: "+ M.getParameterCount());
               System.out.println("The parameter is a(n) " + p.getType().getSimpleName());
           }
           
           //System.out.println();
       }
       
       System.out.println("END OF PART 1///////////////////////////////////////////");
       System.out.println();
      
      
       ///////////////////////////////////////////////////////////////////////////
       
       Class<Address> B = Address.class;
       Method m2[]= B.getMethods();
      
       System.out.println("START OF PART 2:");
       for(Method M : m2) 
       {
           System.out.println("This declared method for class ADDRESS is: " + M.toString());
        
           Parameter parameter[] = M.getParameters();
           for(Parameter p : parameter) 
           {
               System.out.println("Number of parameters: "+ M.getParameterCount());
               System.out.print("The parameter is a(n): " + p.getType().getSimpleName());
           }
          
           //System.out.println();     
           
       }
       
       System.out.println("END OF PART 2///////////////////////////////////////////");
       System.out.println();
      
       //.///////////////////////////////////////////////////////////////////////////
       
       System.out.println("START OF PART 3: ");
       
       Class<Address> C = Address.class;
       Field f1[]= C.getDeclaredFields();
      

       for(Field F: f1) 
       {
           System.out.println("This field is a(n): " + F.getName());
           System.out.println("The field type is: " + F.getType());
          
           int mod = F.getModifiers();
           System.out.println("Access modifier: " + Modifier.toString(mod));
       }
       
       System.out.println("END OF PART 3////////////////////////////////////////////////////");
       System.out.println();
       
       
       ///////////////////////////////////////////////////////////////////////////////////
       
       System.out.println("START OF PART 4/5:");
       
       //Class Person = Class.forName("Person");
       
       //Class Address = Class.forName("Address");
      
//       Person P1 = new Person();
//       Person P2 = new Person();  //got stuck here
//       Person P3 = new Person();
//       
//       Method SFN = Person.getDeclaredMethod("setFirstName", String.class);
//       Method SLN = Person.getDeclaredMethod("setLastName", String.class);
//       Method setAge = Person.getDeclaredMethod("setAge", int.class);
//       
//       SFN.invoke(P1, "Bill");
//       SLN.invoke(P1, "Gates");
//       setAge.invoke(P1, 99);
//       
//       SFN.invoke(P2, "Richard");
//       SLN.invoke(P2, "Moriosi");
//       setAge.invoke(33);
//       
//       SFN.invoke(P3, "Looba");
//       SLN.invoke(P3, "Falafel");
//       setAge.invoke(P3, 2);
       
       
       
       
	}
	
}
