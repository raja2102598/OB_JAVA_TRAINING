package com.onebill.corejava.strings.day4;

public class StringOperations {

	public static void main(String[] args) {
		String s1="Welcome to Java";
		String s2="Welcome to Java Programming";
		String s3="           Welcome to Java Programming        ";
		String s4="Java";		
		String s5="Java";		
		System.out.println("Length is "+s1.length());
		System.out.println("Character at 3rd index is "+s1.charAt(4));
		System.out.println("Index of to is "+s1.indexOf("to"));
		System.out.println("Concatenated String "+s1.concat(s2));
		System.out.println(s4.equals(s5));
		System.out.println("AREA".equalsIgnoreCase("area"));
		System.out.println(s3.trim());
		System.out.println(s2.substring(5));
		System.out.println(s4.compareTo(s5));
		System.out.println(s4.lastIndexOf("a"));
		
	}

}
