package com.onebill.corejava.exception;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int quotient=25/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero");
		}finally {
			System.out.println("Hello");
		}

	}

}
