package com.onebill.corejava.assignments.day4;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1, col1,row2,col2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows for matrix 1: ");
		row1 = s.nextInt();
		System.out.println("Enter number of columns for matrix 1: ");
		col1 = s.nextInt();
		int[][] mat1 = new int[row1][col1];
		System.out.println("Enter the elements");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.println("Enter [" + i + "][" + j + "] : ");
				mat1[i][j] = s.nextInt();
			}
		}
		System.out.println("Enter number of rows for matrix 2: ");
		row2 = s.nextInt();
		System.out.println("Enter number of columns for matrix 2: ");
		col2 = s.nextInt();
		int[][] mat2 = new int[row2][col2];
		System.out.println("Enter the elements");
		for (int i = 0; i < row2; i++) {
			for (int j = 0; j < col2; j++) {
				System.out.println("Enter [" + i + "][" + j + "] : ");
				mat2[i][j] = s.nextInt();
			}
		}
		int[][] res = new int[row1][col2];
		if(row1==col2) {
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					for(int k=0;k<col1;k++) {
						res[i][j] += mat1[i][k] * mat2[k][j];						
					}
				}
			}
			System.out.println("The result of matrix multiplication is");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col2; j++) {
					System.out.print(res[i][j]+ " ");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.println("Multiplication is not possible");
		}

	}

}
