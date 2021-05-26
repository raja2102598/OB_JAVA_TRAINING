package com.onebill.corejava.assignments.day4;

public class ArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6,7,8,2,64,9,10};
		int[] arr1= {14,4,5,9,2,3,1,7,94,19,11};
		arr1=arr;
		arr1[2]=12;
		System.out.println("Array 1");
		for(int i:arr)
			System.out.print(i + " ");
		System.out.println("\nArray 2");		
		for(int i:arr1)
			System.out.print(i + " ");
	}

}
