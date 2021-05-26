package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class ElementPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter number of elements: ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Array Input");
		for(int i=0;i<n;i++) {
			System.out.print("Enter Element Number "+ (i+1)+ " : ");
			arr[i]=s.nextInt();
		}
		for(int i:arr)
			System.out.print(i+ " ");
		System.out.println("\nElements are \n");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==10) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
