package com.onebill.corejava.arrays.day4;

import java.util.Arrays;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][];
		arr[0]=new int[] {1,2,3};
		arr[1]=new int[] {4,5};
		arr[2]=new int[] {6};
		
//		for(int i=0;i<3;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		for(int[] i : arr) {
			System.out.println(Arrays.toString(i));
		}
	}

}
