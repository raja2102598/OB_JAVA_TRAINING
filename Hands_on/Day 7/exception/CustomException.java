package com.onebill.corejava.exception;

class MyException extends Exception {
	MyException(String a) {
		super(a);
	}
}

public class CustomException {

	public static void main(String[] args) {
		try {
			throw new MyException("Exception occured");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
