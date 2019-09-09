package com.example;


public class EmployeeRecord {
	private int id;
	private String name, designation;
	private double salary;
	private String address;

	public EmployeeRecord() {
		System.out.println("   Employee Records of Oracle Corporation ");
		System.out.println("---------------------------------------------");
		System.out.println("Eid" + "\t" + "Ename" + "\t" + "Edesignation" + "\t" + "Esalary" + "\t\t" + "Eaddress");
	}

	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + designation + "\t" + salary + "\t" + address);
	}
	
	protected EmployeeRecord clone(){
		return new EmployeeRecord(id,name,designation,salary,address);  
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		String eaddress = "Pune";
		double esalary = 9000;
		String edesignation = "";
		String ename = "Deepak";
		int eid = 9;
		EmployeeRecord e1 = new EmployeeRecord(eid, ename, edesignation, esalary, eaddress);
//		EmployeeRecord e1 = new EmployeeRecord();

		e1.showRecord();
		System.out.println("\n");
		EmployeeRecord e2 = (EmployeeRecord) e1.clone();
		e2.showRecord();
	}
}
