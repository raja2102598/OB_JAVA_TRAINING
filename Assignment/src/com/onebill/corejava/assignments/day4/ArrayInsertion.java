package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

/* Inserting  an element at specific position in array.
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */
public class ArrayInsertion {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6,7,8};
		int pos,num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the position where you want insert :");
		pos=s.nextInt();
		System.out.println("Enter the number to insert :");
		num=s.nextInt();
		arr[(pos-1)]=num;
		System.out.print("Modified Array [ ");
		for(int a:arr)
			System.out.print(a +" ");
		System.out.print("]");
	}

}
