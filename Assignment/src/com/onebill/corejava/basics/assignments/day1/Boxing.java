package com.onebill.corejava.basics.assignments.day1;

public class Boxing {

	public static void main(String[] args) {
//		AutoBoxing
		int intvalue=10;
		Integer boxedvalue =Integer.valueOf(intvalue);
		System.out.println("Boxed Value : "+boxedvalue);
//		Unboxing
		int unboxedvalue=boxedvalue;
		System.out.println("Unboxed Value : "+unboxedvalue);
	}

}
