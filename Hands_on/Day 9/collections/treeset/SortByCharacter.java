package com.onebill.corejava.collections.treeset;

import java.util.Comparator;

import com.onebill.corejava.collections.linkedlist.Person;

public class SortByCharacter implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getChararter().compareTo(o2.getChararter());
	}

}
