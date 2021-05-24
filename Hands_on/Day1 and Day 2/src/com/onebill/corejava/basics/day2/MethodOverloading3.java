package com.onebill.corejava.basics.day2;

class ParameterOrderOverloading{
	public void display(char c,int i) {
		System.out.println(c);
	}
	public void display(int i,char c) {
		System.out.println(c+" "+i);
	}
}
public class MethodOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterOrderOverloading o3 = new ParameterOrderOverloading();
		o3.display(0,'a');
		o3.display('a',0);
	}

}
