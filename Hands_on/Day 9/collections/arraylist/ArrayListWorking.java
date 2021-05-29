package com.onebill.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWorking {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(3,40);
		a.add(4,50);
		System.out.println(a);
		a.set(1, 2);
		System.out.println(a);
		List<Integer> sublist=a.subList(1, 3);		
		System.out.println(sublist);
		
		//try other methods
	}
}
