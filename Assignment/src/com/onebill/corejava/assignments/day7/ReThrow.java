package com.onebill.corejava.assignments.day7;

public class ReThrow {
	static void test1() throws Exception {
		throw new Exception("Exception from test1");
	}

	static void test2() throws Exception {
		try {
			test1();
		} catch (Exception e) {
			System.out.println("Inside test2");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			test2();
		} catch (Exception e) {
			System.out.println("in main \n" + e.getMessage());
		}
	}
}
