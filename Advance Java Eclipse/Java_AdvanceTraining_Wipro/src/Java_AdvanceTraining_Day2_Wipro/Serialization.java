package Java_AdvanceTraining_Day2_Wipro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EmployeeSerialization implements Serializable{

	int id;
	String name;
	String dept;
	String designation;

EmployeeSerialization (int id, String name, String dept,
		String designation) {
	this.id = id; 
    this.name = name;  
    this.dept = dept;
    this.designation = designation;
   }

public String toString() {
return "Employee Serialization [id=" + id + ", name=" + name + ", "
		+ "dept=" + dept + ","
		+ " designation =" + designation + "]";
}
}

public class Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSerialization empObj = new EmployeeSerialization 
				(101, "Soumyajit", "IT", "Full Stack Developer");
		try {
		FileOutputStream fos = new FileOutputStream 
				("C:SoumyaPractice.txt");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject (empObj);
		
	System.out.println("Employee Object is serialized successfully...");
		fos.close();
		oos.close();

	}catch (FileNotFoundException ex) { 
			System.out.println(ex);
		

	}catch (IOException ex) {
			System.out.println(ex);
		}
	}

}




