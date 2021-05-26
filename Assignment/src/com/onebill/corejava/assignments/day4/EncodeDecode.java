package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class EncodeDecode {

	public static void main(String[] args) {
		String value;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");
		value = s.nextLine().toLowerCase();
		StringBuilder encodedValue = encode(value);
//		StringBuilder decodedValue = decode(encodedValue);
		System.out.println(encodedValue);
		
	}

	public static StringBuilder encode(String value) {
		StringBuilder encodedStr=new StringBuilder();
		for (int i = 0; i < value.length(); i++) {
			if ((value.charAt(i) >= 97) && (value.charAt(i) <= 122)) {
//				System.out.print(value.charAt(i) - 96 +" ");
				encodedStr.append(value.charAt(i) - 96+" ");
			}
			else if(value.charAt(i)==32) {
//				System.out.print(value.charAt(i)+67 +" ");
				encodedStr.append(value.charAt(i) + -32+" ");
			}
		}
		return encodedStr;
	}
//	public static StringBuilder decode(StringBuilder value) {
//		StringBuilder decodedStr=new StringBuilder();
//		for(int i=0,j=0;i<value.length();i++) {
//			if(value.charAt(i)=='-') {
//				System.out.print(value.substring(j, i));
//				j=i;
//			}
//		}
//		return decodedStr;
//	}

}
