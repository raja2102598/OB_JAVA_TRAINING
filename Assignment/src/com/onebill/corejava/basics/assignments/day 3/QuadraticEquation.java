package com.onebill.corejava.basics.assignments.day2;

import java.lang.Math;
public class QuadraticEquation {

	public static void main(String[] args) {
		double a=1;
		double b=5;
		double c=2;
		
		double value=Math.pow(b, 2)-4*a*c;
		double root1=(-b +Math.sqrt(value))/(2*a);
		double root2=(-b -Math.sqrt(value))/(2*a);
		System.out.println(root1);
		System.out.println(root2);
	}

}
