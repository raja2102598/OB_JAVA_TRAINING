package com.onebill.corejava.collections.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPerson {

	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<Person>();
//		p.add(new Person(39, "Sakthi"));
//		p.add(new Person(36, "Raja"));
//		p.add(new Person(11, "Arun"));
//		p.add(new Person(45, "Subash"));
		System.out.println("Before");
		for(Person n:p)
			System.out.println("Id :"+ n.getId() +" Name :" +n.getName());
		Collections.sort(p);
		System.out.println("After");
		for(Person n:p)
			System.out.println("Id :"+ n.getId() +" Name :" +n.getName());
	}

}
