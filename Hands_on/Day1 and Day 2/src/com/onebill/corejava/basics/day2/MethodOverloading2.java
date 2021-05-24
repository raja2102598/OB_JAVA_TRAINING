package com.onebill.corejava.basics.day2;

class ParameterTypeOverloading {
	public void display(char c) {
		System.out.println(c);
	}

	public void display(int c) {
		System.out.println(c);
	}
}

public class MethodOverloading2 {
	public static void main(String[] args) {
		ParameterTypeOverloading o2 = new ParameterTypeOverloading();
		o2.display(0);
		o2.display('a');
	}
}
