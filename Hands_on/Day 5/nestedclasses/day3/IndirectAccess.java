package com.onebill.corejava.nestedclasses.day3;

class OuterClass{
	private	class InnerClass{
		void print() {
			System.out.println("Printing inside Private class");
		}
	}
	void display() {
		InnerClass innerClass =new InnerClass();
		innerClass.print();
	}
}
public class IndirectAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o=new OuterClass();
		o.display();
	}

}
