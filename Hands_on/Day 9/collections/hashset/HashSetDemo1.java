package com.onebill.corejava.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(40);
		h.add(null);
		System.out.println(h);
		h.remove(null);
		System.out.println(h);
		System.out.println(h.size());
		Iterator<Integer> i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
