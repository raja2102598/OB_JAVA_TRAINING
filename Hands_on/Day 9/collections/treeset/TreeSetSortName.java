package com.onebill.corejava.collections.treeset;

import java.util.TreeSet;

import com.onebill.corejava.collections.linkedlist.Person;

public class TreeSetSortName {

	public static void main(String[] args) {
//		TreeSet<Person> p=new TreeSet<Person>(new SortByName());
		TreeSet<Person> p=new TreeSet<Person>(new SortByCharacter());
		p.add(new Person(1, "Raja","Good"));
		p.add(new Person(2, "Arun","Okay"));
		p.add(new Person(3, "Varun","Bad"));
		p.add(new Person(4, "Kumar","Worst"));
		for(Person s:p)
			System.out.println(s.getChararter());
	}

}
