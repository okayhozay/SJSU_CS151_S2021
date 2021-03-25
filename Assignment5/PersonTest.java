import java.util.ArrayList;
import java.util.Collections;
public class PersonTest 
{
	public static void main(String[] args)
	{
		ArrayList<Person> personList = new ArrayList<Person>();
		
//		Person p1 = new Person("John", "Smith", 40);
//		Person p2 = new Person("Amy", "Gold", 32);
//		Person p3 = new Person("Tony", "Stork", 21);
//		Person p4 = new Person("Sean", "Irish", 24);
//		Person p5 = new Person("Tina", "Brock", 28);
//		Person p6 = new Person("Lenny", "Hep", 18);
		
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		Person p6 = new Person();
		
		p1.setfName("John");
		p1.setlName("Smith");
		p1.setAge(40);
		personList.add(p1);
		
		
		p2.setfName("Amy");
		p2.setlName("Gold");
		p2.setAge(32);
		personList.add(p2);
		
		
		p3.setfName("Tony");
        p3.setlName("Stork");
        p3.setAge(21);
		personList.add(p3);
		
		
		p4.setfName("Sean");
        p4.setlName("Irish");
        p4.setAge(24);
		personList.add(p4);
		
		
		p5.setfName("Tina");
        p5.setlName("Brock");
        p5.setAge(28);
		personList.add(p5);
		
		
		p6.setfName("Lenny");
        p6.setlName("Hep");
        p6.setAge(18);
		personList.add(p6);
		
		
		//System.out.println(p1);
		
		// You will have to uncomment which ever test case you would like to use.
		
		
		//AGE IN ASCENDING ORDER
		personList.sort((o1, o2) 
				-> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge())));
 /*              
    //AGE IN DESCENDING ORDER
        personList.sort((o2, o1) 
        		-> (Integer.compare(((Person) o1).getAge(), ((Person) o2).getAge())));
               
    //FIRSTNAME IN ASCENDING ORDER
        personList.sort((o1, o2) 
        		-> ((Person) o1).getfName().compareTo(((Person) o2).getfName()));
               
    //FIRSTNAME IN DESCENDING ORDER
        personList.sort((o2, o1) 
        		-> ((Person) o1).getfName().compareTo(((Person) o2).getfName()));
               
    //LENGTH OF LAST NAME IN ASCENDING ORDER
        personList.sort((o1, o2) 
        		-> (Integer.compare(((Person) o1).getlName().length(), ((Person) o2).getlName().length())));   
               
    //LENGTH OF LAST NAME IN DESCENDING ORDER
        personList.sort((o2, o1) 
        		-> (Integer.compare(((Person) o1).getlName().length(), ((Person) o2).getlName().length())));  
*/
               
          for (int i = 0; i < personList.size(); i++) {
                  System.out.print(((Person) personList.get(i)).getfName());
                  System.out.print(" "+((Person) personList.get(i)).getlName() +", ");
                  System.out.print(((Person) personList.get(i)).getAge()+"\n");
                  
          }
	}

}
