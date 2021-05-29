package com.onebill.corejava.assignments.day9;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * it contains unique elements.
 * it may have one null key and multiple null values.
 * it is non synchronized.
 * it maintains insertion order.
 */
public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(1, "Hi");
		lhm.put(2, "Welcome");
		lhm.put(3, "To");
		lhm.put(4, "Chennai");
		lhm.put(5, "Duplicate");
		lhm.put(6, "Duplicate");
		lhm.put(7, null);
		lhm.put(8, null); //only one for key 8
		lhm.put(8, null); //unique elements only
		lhm.put(8, null);
		lhm.put(null, "Only one null key"); //this will be removed
		System.out.println(lhm+"\n");		
		lhm.put(null, "Another null key");//this will be assigned to null key
		System.out.println(lhm+"\n");
		
//		Keys
		System.out.println("Keys : "+lhm.keySet());
//		Values
		System.out.println("Values : "+lhm.values()+"\n");
//		Key Value Pairs
		Set<Entry<Integer, String>> entrySet = lhm.entrySet();
		for(Entry<Integer,String> i:entrySet)
			System.out.print(i +" ");
	}

}
