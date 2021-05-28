package com.onebill.corejava.exception;

class NonIntException extends Exception {
	public NonIntException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numer = { 2, 4, 55, 43, 66, 7, 98, 9 };
		int[] denom = { 2, 0, 7, 0, 6, 2 };
		for (int i = 0; i < numer.length; i++) {
			try {
				int n = numer[i] / denom[i];
				if (numer[i] % denom[i] != 0) {
					throw new NonIntException("returns decimal number when dividing");
				}
				System.out.println("Divide " + numer[i] + "/" + denom[i] + " is " + n);
			} catch (NonIntException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Divide by zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO: handle exception
				System.out.println("Can't find matching denominator");
			} catch (Exception e) {
				System.out.println("Error");
			}

		}
	}

}
