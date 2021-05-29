package com.onebill.corejava.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListString {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Java");
		list.add("JavaScript");
		list.add("TypeScript");
		list.add("Python");
		System.out.println(list);
		System.out.println(list.get(1));
		list.set(0, "SQL");
		System.out.println(list);
	}

}
