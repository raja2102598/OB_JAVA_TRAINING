package com.onebill.corejava.basics.assignments.day1;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		String key="Z".toLowerCase();
		String userInput;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hi,Welcome to the Guessing Game !!!!");
		for (int i=0;i<50;i++) {
			System.out.println("Enter the Character: ");
			userInput = scanner.nextLine().toLowerCase();
			if (userInput.equals(key)) {
				System.out.println("You Are Right!!!!!!!\nCongrats......");
				scanner.close();
				break;
			} else if (userInput!=key) {
				System.out.println("Try Again");
			}
		}
		
	}

}
