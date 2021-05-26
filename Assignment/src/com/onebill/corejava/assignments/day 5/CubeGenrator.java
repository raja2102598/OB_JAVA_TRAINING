package com.onebill.corejava.assignments.day3;

import java.util.Scanner;

/* Class Description : Based on the user input limit it creates the cube from 1 to until the limit
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class CubeGenrator {
	
	public static void main(String[] args) {

		int limit;
		Scanner s = new Scanner(System.in);
		System.out.print("Cube Generator \nEnter the Limit :");
		limit = s.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			System.out.println("Cube of " + i + " is " + (int) Math.pow(i, 3));
		}
	}

}
