package com.onebill.corejava.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[10];
		try {
			System.out.println("Before");
			numbers[11]=34;
			System.out.println("After");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Array index out of bounds");
			
		}

	}

}
