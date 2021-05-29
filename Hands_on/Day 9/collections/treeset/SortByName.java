package com.onebill.corejava.collections.treeset;

import java.util.Comparator;

import com.onebill.corejava.collections.linkedlist.Person;

public class SortByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
