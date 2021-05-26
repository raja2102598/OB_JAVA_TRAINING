package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String string=s.nextLine();
		System.out.print("Enter Checking Sequence :");
		String check=s.nextLine();
		if(string.contains(check))
			System.out.println("Given string contains the specified sequence of characters");
		else
			System.out.println("Given string does not contains the specified sequence of characters");
	}

}
