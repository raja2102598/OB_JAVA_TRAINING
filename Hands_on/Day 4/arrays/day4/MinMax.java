package com.onebill.corejava.arrays.day4;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[5];
		int min,max;
		numbers[0]=11;
		numbers[1]=121;
		numbers[2]=-11;
		numbers[3]=141;
		numbers[4]=161;
		min=max=numbers[0];
		for(int i=0;i<=4;i++) {
			if(numbers[i]<min) min=numbers[i];
			if(numbers[i]>min) max=numbers[i];
			
		}
		System.out.println("Max is "+max+" Min is "+min);
	}

}
