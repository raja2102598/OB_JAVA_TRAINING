package com.onebill.corejava.basics.day2;

public class Bitwise {
	public static void main(String[] args) {
		int first=4;
		int second=5;
		
		first&=4;
		second^=5;
		first>>=1;
		second<<=2;
		
		System.out.println("First :"+first);
		System.out.println("Second :"+second);
	}
}
