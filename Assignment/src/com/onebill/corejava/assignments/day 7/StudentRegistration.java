package com.onebill.corejava.assignments.day7;

import java.util.Scanner;

class AgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException(String s) {
		super(s);
	}
}

class WeightException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WeightException(String s) {
		super(s);
	}
}

public class StudentRegistration {

	public static void main(String[] args) throws AgeException, WeightException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name, mobno;
		int age, weight;
		System.out.print("Enter your name: ");
		name = s.nextLine();
		System.out.print("Enter your mobile number: ");
		mobno = s.nextLine();
		System.out.print("Enter your age: ");
		age = s.nextInt();
		System.out.print("Enter your weight: ");
		weight = s.nextInt();
		if (age < 12) {
			try {
				throw new AgeException("Your age is not enough");
			} catch (AgeException e) {
				System.out.println(e.getMessage());
				
			}
		}
		if (weight < 35) {
			try {
				throw new WeightException("Your Weight is not enough");
			} catch (WeightException e) {
				System.out.println(e.getMessage());
			}

		}
		if(age>=12 &&weight>=35) {
			System.out.println("You're Eligible,Congrats.......");	
		}
		else
			System.out.println("You're Not Eligible,Sorry......");

	}

}
