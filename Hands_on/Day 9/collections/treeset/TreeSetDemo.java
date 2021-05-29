package com.onebill.corejava.collections.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		//stores element in natural order
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(10);
		t.add(230);
		t.add(30);
		t.add(1);
//		t.add(null);
		System.out.println(t);
	}
}
