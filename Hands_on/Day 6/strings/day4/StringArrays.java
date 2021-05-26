package com.onebill.corejava.strings.day4;

public class StringArrays {

	public static void main(String[] args) {
		String[] sample= {"This","is","a","test"};
		System.out.println("Original Array :");
		for(String s:sample)
			System.out.print(s+" ");
		System.out.println();
		sample[1]="was";
		sample[3]=sample[3].concat(", too!");
		System.out.println("Modified Array :");
		for(String s:sample)
			System.out.print(s+" ");
		
	}

}
