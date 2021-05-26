package com.onebill.corejava.assignments.day3;

abstract class Anonymous{
	abstract void print();
}

public class AnonymousClass {

	public static void main(String[] args) {
		Anonymous obj=new Anonymous() {
			@Override
			void print() {
				System.out.println("Anonymous Method");
			}
		};
		obj.print();
	}

}
