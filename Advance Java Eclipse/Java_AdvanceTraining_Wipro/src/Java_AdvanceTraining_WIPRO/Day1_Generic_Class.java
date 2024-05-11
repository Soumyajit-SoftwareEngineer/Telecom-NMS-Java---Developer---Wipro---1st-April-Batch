package Java_AdvanceTraining_WIPRO;

public class Day1_Generic_Class {
	
	int id;
	String name;
	String dept;
	String designation;
	
	public Day1_Generic_Class (int id, String name, String dept, 
			String designation) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Day1_Generic_Class[id =" + id + ", name =" + name +","
				+ " dept =" + dept + ", designation = " + designation +"]";
	}
}

class Generics1 <X>{
	X data;
	void assign (X data) {
		this.data = data;
}
	
	void display() {
		System.out.println("Given data : " + data);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Generics1 <Integer> intObj = new Generics1 <Integer>();
		intObj.assign(100);
		intObj.display();
		
		Generics1 <String> StrObj = new Generics1 <String>();
		StrObj.assign("Java Generics");
		StrObj.display();
		
		Day1_Generic_Class empObj = new Day1_Generic_Class (101, 
				"Soumyajit", "IT", "Full Stack Developer");
		Generics1<Day1_Generic_Class> empGen = 
				new Generics1<Day1_Generic_Class>();
		empGen.assign(empObj);
		empGen.display();
		
	}
}
