package com.onebill.corejava.assignments.day9;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

class SortId implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
}

public class StudentHashSet {

	public static void main(String[] args) {
		HashSet<Student> studentHS = new HashSet<Student>();
		studentHS.add(new Student(36, "Raja", 45));
		studentHS.add(new Student(1, "Arun", 70));
		studentHS.add(new Student(12, "Ganesh", 50));
		studentHS.add(new Student(39, "Sakthi", 80));
		studentHS.add(new Student(45, "Subash", 90));
//		System.out.println(studentHS);
//		Sort by id/Marks/name
		TreeSet<Student> s=new TreeSet<Student>(studentHS);
		for(Student s1:s) {
			System.out.println(s1);
		}
		

	}

}
