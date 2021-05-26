package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

/* Reversing a Array
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class ArrayReverse {

	public static void main(String[] args) {
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
		System.out.print("Array Reverse \n[ ");
		for(int j=arr.length-1;j>=0;j--) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("]");
	}

}
