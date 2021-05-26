package com.onebill.corejava.basics.day2;

class Person{
	String name;
	String address;
	public Person() {
		this.name="not known";
		this.address="not known";
	}
	public Person(String name) {
		this();
		this.name=name;
	}
	public Person(String name,String address) {
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person("Raja");
		Person p3=new Person("Raja","Madurai");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}
