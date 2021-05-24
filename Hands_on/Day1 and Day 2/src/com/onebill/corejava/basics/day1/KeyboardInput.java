package com.onebill.corejava.basics.day1;

import java.io.IOException;

public class KeyboardInput {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the Value :");
		try {
			ch=(char) System.in.read();
			System.out.println("The Entered Value is :"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
