package com.onebill.corejava.exception;

import java.io.IOException;

public class ThrowsExample2 {
	
	public static char prompt(String str) throws IOException{
		System.out.println(str);
		return (char) System.in.read();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		try {
			ch=prompt("Enter :");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
		System.out.println("Completed");
	}

}
