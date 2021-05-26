package com.onebill.corejava.assignments.day3;

public class StaticNested {
	
	static class InnerStaticNested{
		public void display() {
			System.out.println("This is static nested class");
		}
	}

	public static void main(String[] args) {
		InnerStaticNested obj =new InnerStaticNested();
		obj.display();
	}

}
