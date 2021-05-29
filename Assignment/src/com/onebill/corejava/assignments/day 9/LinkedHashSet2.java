package com.onebill.corejava.assignments.day9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {
		LinkedHashSet<Student> s1=new LinkedHashSet<Student>();
		s1.add(new Student(1,"Raja",90));
		s1.add(new Student(2,"Arun",90));
		s1.add(new Student(3,"Kumar",90));
		s1.add(new Student(4,"Varun",90));
		System.out.println(s1);
//		checking its empty or not
		System.out.println("Empty : "+s1.isEmpty());
//		using foreach
		System.out.println("using foreach");
		for(Student s:s1) {
			System.out.println(s);
		}
//		using iterator
		System.out.println("using iterator");
		Iterator<Student> i=s1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
