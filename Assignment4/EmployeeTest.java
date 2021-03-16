
public class EmployeeTest 
{
	public static void main(String[] args) throws Employee.TooManyHoursWorkedException, Employee.NumberFormatException
	{
		Employee e1 = new Employee("John", "Smith", "101", 35);
		
        int[] arr = {40, 23, 1, 0, -5, 45};
        for(int i: arr) {
            try
            {
                System.out.println(e1.computePay(i));
            }
            catch(Employee.TooManyHoursWorkedException q)
            {
                System.out.println(q);
            }
            catch(Employee.NumberFormatException e)
            {
                System.out.println(e);
            }
        }
	}

}
