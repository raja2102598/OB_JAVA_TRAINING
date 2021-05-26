package com.onebill.corejava.assignments.day3;

/* Implementing Method Local Inner Classes
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

class Outer {
	void myMethod() {
		class Inner {
			void print() {
				System.out.println("I'm inside a class which is inside a method");
			}
		}

		Inner obj = new Inner();
		obj.print();
	}

}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.myMethod();
	}

}
