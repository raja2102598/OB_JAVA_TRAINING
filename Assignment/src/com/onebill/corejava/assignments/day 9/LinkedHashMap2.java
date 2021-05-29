package com.onebill.corejava.assignments.day9;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2 {

	public static void main(String[] args) {
		LinkedHashMap<Student,Integer> s1=new LinkedHashMap<Student,Integer>();
		s1.put(new Student(1,"Raja",90), 11);
		s1.put(new Student(2,"Arun",90), 1);
		s1.put(new Student(3,"Kumar",90), 32);
		s1.put(new Student(4,"Varun",90),6);
//		Keys
		System.out.println("Keys : "+s1.keySet());
//		Values
		System.out.println("Values : "+s1.values()+"\n");
//		Key Value Pairs

		Set<Entry<Student, Integer>> entrySet1 = s1.entrySet();
		for(Entry<Student,Integer> i: entrySet1) {
			System.out.println(i);
		}
		
	}

}
