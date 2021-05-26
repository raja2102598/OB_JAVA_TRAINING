package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class EncodeDecode {

	public static void main(String[] args) {
		String value;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String : ");
		value = s.nextLine().toLowerCase();
		int encodedValue[] = encode(value);
		int decodedValue[] = decode(encodedValue);
		System.out.println("Encoded Value \n");		
		for(int i:encodedValue)
			System.out.print(i+" ");
		System.out.println("Decoded Value \n");
		for(int i:decodedValue)
			System.out.print(Character.toString(i));
		
	}

	public static int[] encode(String value) {
		int[] encodedStr=new int[value.length()];
		for (int i = 0,j=0; i < value.length(); i++) {
			if ((value.charAt(i) >= 97) && (value.charAt(i) <= 122)) {
//				System.out.print(value.charAt(i) - 96 +" ");
				encodedStr[j]=value.charAt(i) - 96;
				j++;
			}
			else if(value.charAt(i)==32) {
//				System.out.print(value.charAt(i)+67 +" ");
				encodedStr[j]=value.charAt(i)-32;
				j++;
			}
		}
		return encodedStr;
	}
	public static int[] decode(int[] value) {
		int[] decodedStr=new int[value.length];
		
		for (int i = 0,j=0; i < value.length; i++) {
			if(value[i]>=1 && value[i]<=26) {
				decodedStr[j]=value[i]+96;
				j++;
			}
			else if(value[i]==0) {
				decodedStr[j]=value[i]+32;
				j++;
			}
			
		}
		return decodedStr;
	}

}
