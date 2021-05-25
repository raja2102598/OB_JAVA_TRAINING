package com.onebill.corejava.arrays.day4;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {1,2,3,4,5,6,7,8,9,10};
		int s=0;
//		for(int i=0;i<10;i++) {
//			s+=numbers[i];
//		}
		
		for(int i:numbers){
			s+=i;
		}
		System.out.println("Sum : "+s);
		System.out.println("Average : "+s/numbers.length);
	}

}
