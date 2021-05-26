package com.onebill.corejava.nestedclasses.day3;

class Outer{
	class Inner{
		public void show() {
			System.out.println("Inner Class Method");
		}
	}
}
public class InnerOuter {
	public static void main(String[] args) {
		Outer.Inner obj=new Outer().new Inner();
		obj.show();
	}
}
