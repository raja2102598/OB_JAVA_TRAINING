package com.onebill.corejava.assignments.day3;

/* Creates pascal's triangle
 * 
 * @version 1.0
 * @author Raja Jaisankar
 */

public class PascalTriangle {

	public static void main(String[] args) {
		int rows = 6;
		int coefficient = 1;
		for (int i = 0; i < rows; i++) {
			for (int s = 1; s < rows - i; s++) {
				System.out.print("  ");
			}

			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0)
					coefficient = 1;
				else
					coefficient = coefficient * (i - j + 1) / j;

				System.out.printf("%4d", coefficient);
			}

			System.out.println();
		}
	}
}
