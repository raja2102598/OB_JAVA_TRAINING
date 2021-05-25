package com.onebill.corejava.strings.day4;

public class StringBB {
	public static void /*String*/ concat1(String s1) {
		s1=s1+"freshers";
//		return s1;
	}
	public static void concat2(StringBuffer s2) {
		s2.append("freshers");
	}
	public static void concat3(StringBuilder s3) {
		s3.append("freshers");
	}
	public static void main(String[] args) {
		String s1="Hello ";
		concat1(s1);
//		s1=concat(s2);
		System.out.println(s1);
		StringBuffer s2=new StringBuffer(s1);
		concat2(s2);
		System.out.println(s2);
		StringBuilder s3=new StringBuilder(s1);
		concat3(s3);
		String s=new String(s2);
		System.out.println(s2);
		System.out.println(s3);
//		System.out.println();
		
	}

}
