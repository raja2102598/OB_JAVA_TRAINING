package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows for matrix: ");
		row = s.nextInt();
		System.out.println("Enter number of columns for matrix: ");
		col = s.nextInt();
		int[][] mat1 = new int[row][col];
		System.out.println("Enter the elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter [" + i + "][" + j + "] : ");
				mat1[i][j] = s.nextInt();
			}
		}
		int[][] mat2 = new int[row][col];
		System.out.println("Enter the elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.println("Enter [" + i + "][" + j + "] : ");
				mat2[i][j] = s.nextInt();
			}
		}
		int[][] res = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("The result of matrix addition is");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
