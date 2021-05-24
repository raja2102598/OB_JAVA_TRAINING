package com.onebill.corejava.basics.day2;

public class ShortCircuit {

	public static void main(String[] args) {
		if (false && true && true) {
			System.out.println("this will not be printed");
		} else {
			System.out.println("this will be printed");
		}
		if (true || false || false) {
			System.out.println("this will be printed");
		} else {
			System.out.println("this will not be printed");
		}
	}

}
