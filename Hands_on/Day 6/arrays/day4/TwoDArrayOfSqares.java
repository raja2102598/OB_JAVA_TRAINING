package com.onebill.corejava.arrays.day4;

public class TwoDArrayOfSqares {

	public static void main(String[] args) {
		int[][] arr = new int[10][2]; // 10*2 Array
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][0] = i + 1;
				arr[i][1] = arr[i][0] * arr[i][0];
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
