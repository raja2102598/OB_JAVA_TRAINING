package com.onebill.corejava.assignments.day3;

/* Creates Floyds Triangle
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class FloydsTriangle {

	public static void main(String[] args) {
		int rows = 4, value = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
	}
}
