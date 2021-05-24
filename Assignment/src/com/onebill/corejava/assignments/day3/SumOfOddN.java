package com.onebill.corejava.assignments.day3;

import java.util.Scanner;

/* Class Description : This calculates the sum of odd natural numbers 
 * from 1 to user given limit 
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class SumOfOddN {

	public static void main(String[] args) {
		int limit;
		int sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Sum of Odd Natutal Numbers \nEnter the Limit :");
		limit = s.nextInt();
//		for(int i=1;i<=limit;i+=2) {
//			sum+=i;
//		}
		sum=(int) Math.pow((limit/2),2);  //Formula For Calculating
		System.out.println("The Sum is :"+sum);
	}
}
