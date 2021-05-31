package com.onebill.corejava.assignments.day10;

import java.text.Collator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		TreeSet<Students> s1=new TreeSet<Students>(new SortBySId());
		StudentsSorter obj=new StudentsSorter();
		s1=obj.studentsAdder(s1);
		System.out.println(s1);
		
		long s2=s1.stream().count();
		System.out.println(s2);
		
		List l=s1.stream().filter(student->student.getAge()>20).collect(Collectors.toList());
		System.out.println(l);
	}

}
