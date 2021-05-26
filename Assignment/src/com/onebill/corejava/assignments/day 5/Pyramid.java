package com.onebill.corejava.assignments.day3;

import java.util.Scanner;

/*Class Description : Creating a pyramid with numbers,row limit given by user 
 * 
 * @version 0.1
 * @author Raja Jaisankar
 */
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowLimit;
		int rowCount = 1;
		Scanner s = new Scanner(System.in);
		System.out.print("Pyramid\nEnter the Limit Of Rows :");
		rowLimit = s.nextInt();
		for (int i = rowLimit; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rowCount; j++) {
				System.out.print(rowCount + " ");
			}
			System.out.println();
			rowCount++;
		}
	}

}
