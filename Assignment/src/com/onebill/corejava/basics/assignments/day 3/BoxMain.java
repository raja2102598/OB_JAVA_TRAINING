package com.onebill.corejava.basics.assignments.day2;

import java.util.Scanner;

class Box{
	double height;
	double width;
	double depth;
	public Box() {
		this.height=0;
		this.width=0;
		this.depth=0;
	}
	public Box(double height,double width,double depth) {
		this();
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	public double volume() {
		return height*width*depth;
	}
	
}
public class BoxMain {

	public static void main(String[] args) {
		double height;
		double width;
		double depth;	
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Height :");
		height=s.nextDouble();
		System.out.print("Enter the Width :");
		width=s.nextDouble();
		System.out.print("Enter the Depth:");
		depth=s.nextDouble();
		Box obj=new Box(height,width,depth);
		System.out.println(obj.volume());
	}

}
