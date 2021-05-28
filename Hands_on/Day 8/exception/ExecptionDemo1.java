package com.onebill.corejava.exception;

class ExceptionMenu {
	static void generateException() {
		int[] numbers = new int[10];
		System.out.println("Before");
		numbers[11] = 34;
		System.out.println("After");
	}
}

public class ExecptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ExceptionMenu.generateException();
		}catch (Exception e) {
			System.out.println("Array index out of bounds");
		}
		System.out.println("Completed ");
		

	}

}
