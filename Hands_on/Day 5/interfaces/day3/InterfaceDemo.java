package com.onebill.corejava.interfaces.day3;

interface ExampleInterface{
	void Display();
}

public class InterfaceDemo implements ExampleInterface {

	public static void main(String[] args) {
		ExampleInterface n=new InterfaceDemo();
		n.Display();
	}

	@Override
	public void Display() {
		System.out.println("Implementation for  the method");
	}

}
