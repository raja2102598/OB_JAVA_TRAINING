package com.onebill.corejava.assignments.day9;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
 * It inherits HashSet class and implements Set interface.
 * 
 * It contains unique elements only like HashSet.
 * It all optional set operation and permits null elements.
 * It is non synchronized.
 * It maintains insertion order.
 */

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		checking its empty or not
		System.out.println("Empty : "+lhs.isEmpty());
		lhs.add(100);
		lhs.add(200);
		lhs.add(300);
		lhs.add(400);
		lhs.add(500);
		System.out.println(lhs);
//		checking its empty or not
		System.out.println("Empty : "+lhs.isEmpty());
//		using foreach
		System.out.println("using foreach");
		for(Integer s:lhs) {
			System.out.println(s);
		}
//		using iterator
		System.out.println("using iterator");
		Iterator<Integer> i=lhs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
