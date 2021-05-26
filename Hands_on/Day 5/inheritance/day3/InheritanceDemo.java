package com.onebill.corejava.inheritance.day3;

class TwoDShape{
	double height;
	double width;
	void showDimension() {
		System.out.println("Height is "+height+" and Width is "+width);
	}
}
class Triangle extends TwoDShape{
	String style;
	void showStyle() {
		System.out.println("Style of triangle is "+style);
	}
	void calculateArea() {
		System.out.println(height*width/2);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		Triangle t2=new Triangle();
		t1.height=4.0;
		t1.width=2.0;
		t1.style="Hello";
		t1.showDimension();
		t1.showStyle();
		t1.calculateArea();
	}

}
