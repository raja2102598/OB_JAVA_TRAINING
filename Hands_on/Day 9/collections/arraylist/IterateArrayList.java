package com.onebill.corejava.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println("Using for loop");
		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));

		System.out.println("Using for each loop");
		for (Integer i : arrayList)
			System.out.println(i);

		System.out.println("Using Iterator");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("Using List Iterator");
		ListIterator<Integer> listIterator = arrayList.listIterator();
		while (listIterator.hasNext())
			System.out.println(listIterator.next());
		
		System.out.println("Using List iterator (backwards)");
		ListIterator<Integer> listIterator1 = arrayList.listIterator(arrayList.size());
		while (listIterator1.hasPrevious())
			System.out.println(listIterator.previous());

	}

}
