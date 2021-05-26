package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

/* Deleting  an element at specific position in array.
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */
public class ArrayDeletion {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6,7,8};
		int pos;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the position where you want to delete :");
		pos=s.nextInt();
		int[] copy = new int[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
		    if (i != pos) {
		        copy[j++] = arr[i];
		    }
		}
		System.out.print("Modified Array [ ");
		for(int a:copy)
			System.out.print(a +" ");
		System.out.print("]");
	}

}
