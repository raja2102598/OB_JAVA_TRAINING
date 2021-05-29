package com.onebill.corejava.assignments.day9;

import java.util.Enumeration;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		Vector<Student> s1=new Vector<Student>();
		s1.add(new Student(1,"Raja",90));
		s1.add(new Student(2,"Arun",10));
		s1.add(new Student(3,"Kumar",98));
		s1.add(new Student(4,"Varun",50));
		System.out.println(s1);
//		add object
		s1.addElement(new Student(1,"Ajith",12));
//		first element
		System.out.println(s1.firstElement());
//		last element
		System.out.println(s1.lastElement());
//		remove elements
//		v.removeAllElements();
		System.out.println(s1);
//		remove element at index 1
		s1.remove(1);
		System.out.println(s1);
		s1.remove(new Student(4,"Varun",50));
//		check capacity
		System.out.println(s1.capacity());
//		Using Enumeration for Traverse
		System.out.println("Using Enumeration for Traverse");
		Enumeration<Student> i=s1.elements();
		while(i.hasMoreElements()) {
			System.out.println(i.nextElement());
		}
	}

}
