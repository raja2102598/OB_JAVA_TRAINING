package com.onebill.corejava.collections.treemap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Employee,Integer> tm=new TreeMap<Employee,Integer>(new SortById());
		tm.put(new Employee(1, "Raja"), 1);
		tm.put(new Employee(2, "Arun"), 2);
		tm.put(new Employee(3, "Varun"), 3);
		tm.put(new Employee(4, "Ajith"), 4);
		Set<Map.Entry<Employee,Integer>> m1=tm.entrySet();
		for(Entry<Employee,Integer> v:m1) {
			System.out.println(v.getKey().ename);
		}
	}

}
