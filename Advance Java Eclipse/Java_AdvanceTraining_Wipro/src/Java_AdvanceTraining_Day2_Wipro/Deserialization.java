package Java_AdvanceTraining_Day2_Wipro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSerialization empObj = new EmployeeSerialization 
				(101, "Soumyajit", "IT", "Full Stack Developer");
		
		try {
		FileInputStream fis = new FileInputStream
				("C:SoumyaPractice.txt");

		ObjectInputStream ois = new ObjectInputStream (fis);

		EmployeeSerialization empobj = 
				(EmployeeSerialization) ois.readObject();

		System.out.println("Object deserialized is: " + empobj);

		}catch (FileNotFoundException ex) { 
			System.out.println(ex);

		} catch (IOException ex) { 
	      System.out.println(ex);
	      
		} catch (ClassNotFoundException ex) { 
    	  System.out.println(ex);

		}
 
	}
}


