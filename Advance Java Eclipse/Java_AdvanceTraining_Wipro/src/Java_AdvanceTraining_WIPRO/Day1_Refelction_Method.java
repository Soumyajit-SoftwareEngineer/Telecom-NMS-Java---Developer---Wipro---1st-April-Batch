package Java_AdvanceTraining_WIPRO;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Employee3 {
		public String getData() {
		return "Returning the data";
	}
	
	public void setData() {
		
	}

}

public class Day1_Refelction_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Employee3 emp = new Employee3();
		Class obj = emp.getClass();
		
		Method listOfMethods[] = obj.getDeclaredMethods();
		for (Method m: listOfMethods) {
			String methodName = m.getName();
			System.out.println("\nMethod name is :" +methodName);
			
			int intModifier = m.getModifiers();
			String strModifier = Modifier.toString(intModifier);
			System.out.println("Modifier of the class : " + strModifier);
			System.out.println("Method return type : " + m.getReturnType());
		}

	}

}
