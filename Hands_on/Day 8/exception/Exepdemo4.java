package com.onebill.corejava.exception;

public class Exepdemo4 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("Age is not valid");
		else
			System.out.println("You can vote");
	}

	public static void main(String[] args) {
		try {
			validate(14);
		}catch (ArithmeticException e) {
			// TODO: handle exception
//			System.out.println(e.getMessage());
			System.out.println("Not enough age");
		}
		System.out.println("Other logics");
	}
}
