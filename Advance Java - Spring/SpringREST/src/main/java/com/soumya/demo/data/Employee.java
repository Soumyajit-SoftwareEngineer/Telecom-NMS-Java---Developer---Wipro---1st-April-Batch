package com.soumya.demo.data;

public class Employee {
	
	int id;
	String name;
	String dept;
	String designation;
	
	
	public Employee(int id, String name, String dept, String designation) {
		super();
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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", designation=" + designation + "]";
	}
	

}
