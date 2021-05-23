package com.onebill.corejava.basics.day2;

class ReferenceDemo{
	int value=10;//instance var
	public void dislay() {
		String s="Hello"; //Local var
		System.out.println(value);
	}
	public int add(int i,int j) {//Formal params
		return i+j;
	}
}

public class ReferenceDemoMain {

	public static void main(String[] args) {
			ReferenceDemo obj=new ReferenceDemo();//reference var
			obj.dislay();
			obj.add(10, 20);//actual params
	}

}
