package com.onebill.corejava.assignments.day3;

import java.util.Scanner;

/* Check Increasing or Decreasing
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class Order {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		a = s.nextInt();
		System.out.print("Enter the Second Number :");
		b = s.nextInt();
		System.out.print("Enter the Third Number :");
		c = s.nextInt();
		if(a<b && b<c)
			System.out.println("Increasing");
		else if(a>b && b>c) 
			System.out.println("Decreasing");			
		else
			System.out.println("Neither Increasing Order Nor Decreasing");
			
			
	}

}
