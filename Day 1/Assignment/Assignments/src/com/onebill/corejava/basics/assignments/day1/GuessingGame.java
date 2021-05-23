package com.onebill.corejava.basics.assignments.day1;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		String key="z";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hi,Welcome to the Guessing Game !!!!");
		for(int i=0;i<50;i++) {
			System.out.println("Enter the Character: ");
			String user_input = scanner.nextLine();
			if(user_input.equals(key)) {
				System.out.println("You Are Right!!!!!!!\nCongrats......");
				scanner.close();
				break;
			}
			else if(user_input!=key) {
				System.out.println("Try Again");
			}
		}
		
	}

}
