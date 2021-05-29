package com.onebill.corejava.collections.hashmap;

import java.security.KeyStore.Entry;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> h1=new HashMap<String,Integer>();
		h1.put("one", 1);
		h1.put("two", 2);
		h1.put("three", 3);
		h1.put("four", 4);
		Set<Map.Entry<String,Integer>> m1=h1.entrySet();
		for(Map.Entry<String,Integer> entry:m1) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		Set<String> s2=h1.keySet();
		for(String s:s2)
			System.out.println(s);
		
		Collection<Integer> a1=h1.values();
		for(Integer sa:a1)
			System.out.println(sa);		
	}
}
