package com.onebill.corejava.staticdemo.day3;

class Employee1{
	int id;
	String name;
	static String companyName="One Bill";
	static void changeName() {
		companyName="Tech Yantra";
	}
	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " "+ name +" " +companyName );
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1(121, "Raja");
		Employee1 e2=new Employee1(131, "Arun");
		Employee1.changeName();
		e1.display();
		e2.display();
	}

}
