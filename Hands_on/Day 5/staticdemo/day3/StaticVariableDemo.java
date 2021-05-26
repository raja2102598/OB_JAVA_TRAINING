package com.onebill.corejava.staticdemo.day3;

class Employee{
	int id;
	String name;
	static String companyName="One Bill";
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " "+ name +" " +companyName );
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(121, "Raja");
		Employee e2=new Employee(131, "Arun");
		Employee.companyName="new name";
		e1.display();
		e2.display();
	}

}
