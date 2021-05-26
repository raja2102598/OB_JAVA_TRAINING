package com.onebill.corejava.arrays.day4;

public class LengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list=new int[10];
		int[] num= {1,2,3};
		int[][] table= {
				{1,2,3},
				{5,6},
				{4,5,7,8}
		};
		System.out.println("Length of List :"+list.length);
		System.out.println("Length of num :"+num.length);
		System.out.println("Length of Table:"+table.length);
		System.out.println("Length of Table[2]:"+table[2].length);
		
	}

}
