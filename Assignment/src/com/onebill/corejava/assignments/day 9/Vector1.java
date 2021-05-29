package com.onebill.corejava.assignments.day9;

import java.util.Enumeration;
import java.util.Vector;

/*
 * It is recommended to use the Vector class in the thread-safe implementation only.
 * Vector is synchronized.
 * Java Vector contains many legacy methods that are not the part of a 
 * collections framework.
 */

public class Vector1 {

	public static void main(String[] args) {
//		default initial capacity=10,we can change the capcity by passing the value through constructor
		Vector<Integer> v=new Vector<Integer>(100);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
//		add object
		v.addElement(new Integer(1));
//		first element
		System.out.println(v.firstElement());
//		last element
		System.out.println(v.lastElement());
//		remove elements
//		v.removeAllElements();
		System.out.println(v);
//		remove element at index 1
		v.remove(1);
		System.out.println(v);
		v.remove(new Integer(50));
		System.out.println(v);
//		check capacity
		System.out.println(v.capacity());
//		Using Enumeration for Traverse
		System.out.println("Using Enumeration for Traverse");
		Enumeration<Integer> i=v.elements();
		while(i.hasMoreElements()) {
			System.out.println(i.nextElement());
		}
		
	}

}
