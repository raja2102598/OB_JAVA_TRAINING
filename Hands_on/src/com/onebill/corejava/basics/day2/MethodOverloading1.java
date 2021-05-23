package com.onebill.corejava.basics.day2;

class ParameterOverloading{
	public void display(char c) {
		System.out.println(c);
	}
	public void display(char c,int i) {
		System.out.println(c+" "+i);
	}
}
public class MethodOverloading1 {
	public static void main(String[] args) {
		ParameterOverloading o1=new ParameterOverloading();
		o1.display('a');
		o1.display('a',1);
	}
	
}
