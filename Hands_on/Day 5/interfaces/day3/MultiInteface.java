//Multiple Interfaces Implementation 

package com.onebill.corejava.interfaces.day3;

interface InterfaceOne {
	void methodOne();
}

interface InterfaceTwo {
	void methodTwo();
}

interface InterfaceThree extends InterfaceOne, InterfaceTwo {
	void methodThree();
}

public class MultiInteface implements InterfaceThree {
	public static void main(String[] args) {
		InterfaceThree Obj=new MultiInteface();
		Obj.methodOne();
		Obj.methodTwo();
		Obj.methodThree();
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 implementation");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 implementation");
		
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("Method 3 implementation");
		
	}

}
