package com.onebill.corejava.inheritance.day3;

class Parent{
	int number1;
	Parent(int i) {
		number1=i;
	}
}
class Child extends Parent{
	int number1;
	Child(int i){
		super(i);///first line it calls super class const
		number1=i;
	}
}
public class IncompatibleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1=new Parent(10);
		Parent p2;
		Child c1=new Child(20);
//		p2=c1;
//		c1=p2;
	}

}
