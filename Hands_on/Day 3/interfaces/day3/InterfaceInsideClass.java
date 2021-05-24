package com.onebill.corejava.interfaces.day3;

//Implemetation of Demo Interface inside Test Class

class Test {
	interface Demo {
		void show();
	}
}

class TestingTheInterface implements Test.Demo {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Implemetation of Demo Interface inside Test Class");
	}
}

public class InterfaceInsideClass {
	public static void main(String[] args) {
		Test.Demo obj=new TestingTheInterface();
		obj.show();
	}
}
