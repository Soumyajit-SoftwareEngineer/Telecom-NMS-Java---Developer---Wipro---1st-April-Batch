package Java_AdvanceTraining_WIPRO;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class Employee4{
	private String name;
}


public class Day1_Reflection_PrivateAttribute {
	
	public static void main(String[] args) throws NoSuchFieldException, 
	SecurityException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		
		Employee4 emp = new Employee4();
		Class obj = emp.getClass();
		Field field1 = obj.getDeclaredField("name");
		field1.setAccessible(true);
		field1.set(emp, "Soumya"); 
		
		String nameData = (String) field1.get(emp);
		System.out.println("\nPrivate data modified...Name value : "
		 +nameData);
		int modifier1 = field1.getModifiers();
		String strModifier1 = Modifier.toString(modifier1);
		System.out.println("Field Modifier is : "+ strModifier1);
		
	}

}
