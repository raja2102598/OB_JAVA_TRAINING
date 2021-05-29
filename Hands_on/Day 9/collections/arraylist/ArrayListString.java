package com.onebill.corejava.collections.arraylist;

import java.util.ArrayList;

//Covert arraylist to String  array

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Welcome");
		a.add("To");
		a.add("Java");
		String[] sArray=new String[a.size()];
		for(int i=0;i<sArray.length;i++) {
			sArray[i]=a.get(i);
		}
		for(String s:sArray)
			System.out.print(s +" ");
		
		
	}

}
