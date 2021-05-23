package com.onebill.corejava.basics.day2;

class Student{
	int  id;
	String name;
	double fees;
	public Student(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}	
	void display() {
		System.out.println("id :"+id+" name : "+name+" fees : "+fees);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"Raja",2000);
		s.display();
	}

}
