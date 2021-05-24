package com.onebill.corejava.interfaces.day3;

interface Outer {
	interface Inner{
		void innerMethod();
	}
	void outerMethod();
}
class Test1 implements Outer,Outer.Inner{

	@Override
	public void innerMethod() {
		// TODO Auto-generated method stub
		System.out.println("innerMethod");
	}

	@Override
	public void outerMethod() {
		// TODO Auto-generated method stub
		System.out.println("outerMethod");		
	}
	
}
public class InterfaceInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer;
		Outer.Inner inner;
		Test1 onj =new Test1();
		outer=onj;
		inner=onj;
		outer.outerMethod();
		inner.innerMethod();
	}

}
