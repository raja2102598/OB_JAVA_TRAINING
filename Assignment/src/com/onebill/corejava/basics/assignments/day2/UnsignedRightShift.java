package com.onebill.corejava.basics.assignments.day2;

public class UnsignedRightShift {

	public static void main(String[] args) {
		int a =7; //111
		int unsignedrs=a>>>1; // 111>>>1 ==> 011 right shifts adds zero either positive/negative
		a=-a;
		int rightshift=3>>1; //011>>1  ==> 001
		System.out.println(unsignedrs); //3
		System.out.println(rightshift); //1
	}

}
