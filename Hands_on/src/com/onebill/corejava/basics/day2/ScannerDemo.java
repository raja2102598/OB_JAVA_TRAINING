package com.onebill.corejava.basics.day2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Name :");
		String name=s.nextLine();
		System.out.print("Enter Your Gender :");
		char gender=s.next().charAt(0);
		System.out.print("Enter Your Age :");
		int age=s.nextInt();
		System.out.print("Enter Your Mobile Nuumber :");
		long mobno=s.nextLong();
		System.out.print("Enter Your Salary :");
		double salary=s.nextDouble();
		System.out.println("Name : "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age : "+age);
		System.out.println("Mobile Number : "+mobno);
		System.out.println("Salary: "+salary);
		
	}

}
