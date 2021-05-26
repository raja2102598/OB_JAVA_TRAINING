package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class CheckPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int check;
		int flag=0;
		System.out.print("Enter number of elements: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Array Input");
		for(int i=0;i<n;i++) {
			System.out.print("Enter Element Number "+ (i+1)+ " : ");
			arr[i]=s.nextInt();
		}
		System.out.print("Enter the element to check : ");
		check=s.nextInt();
		for(int i:arr)
			if(check==i)
				flag=1;
		if(flag==1)
			System.out.println("The element is present");
		else
			System.out.println("the element is not present");

	}

}
