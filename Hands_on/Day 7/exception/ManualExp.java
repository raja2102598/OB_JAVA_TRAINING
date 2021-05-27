package com.onebill.corejava.exception;

public class ManualExp {

	public static void main(String[] args) {
		try {
			System.out.println("Before");
			throw new ArithmeticException();
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
			
		}
		System.out.println("Completed");
	}

}
