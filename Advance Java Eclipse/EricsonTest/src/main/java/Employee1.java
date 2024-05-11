
public class Employee1 {
	
	int id;
	String name;
	String dept;
	String designation;
	
	Employee1(){}
		public Employee1(int id, String name, String dept, String designation) {
			
			this.id = id;
			this.name = name;
			this.dept = dept;
			this.designation = designation;
		}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
