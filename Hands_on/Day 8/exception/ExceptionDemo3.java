package com.onebill.corejava.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numer = { 2, 4, 56, 43, 66, 7, 98, 9 };
		int[] denom = { 2, 0, 6, 0, 6, 2 };
		try {
			for (int i = 0; i < numer.length; i++) {
				try {
					System.out.println("Divide " + numer[i] + "/" + denom[i] + " is " + numer[i] / denom[i]);
				} catch (ArithmeticException e) {
					// TODO: handle exception
					System.out.println("Divide by zero");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No denominator found");
		}
	}
	//use outer try catch for more severe problems
	//use inner try catch for not severe problems.

}
