package com.onebill.corejava.interfaces.day3;

abstract class Shape{
	abstract void display();
}

class Rectangle extends Shape{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("this is Rectangle");
	}
	
}

class Circle extends Shape{

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("this is Circle");
	}
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1=new Rectangle();
		s1.display();
		Shape s2=new Circle();
		s2.display();
	}

}
