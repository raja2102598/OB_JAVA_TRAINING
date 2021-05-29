package com.onebill.corejava.collections.linkedlist;

import java.util.LinkedList;

public class LinkedListInt {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println("--add with index----");
		list.add(0,1);
		System.out.println(list);
		System.out.println("----Remove by object and index------");
		list.remove();//remove first element
		list.remove(1);
		list.remove(new Integer(40));
		System.out.println(list);
		System.out.println("Set at index");
		list.set(1,22);
		System.out.println(list);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println("Contains all");		
		LinkedList<Integer> list1=new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(22);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1);
		System.out.println(list.containsAll(list1));
		list1.addFirst(10);
		list1.addLast(20);
	
	}
}
