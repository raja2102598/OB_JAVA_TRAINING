package com.onebill.corejava.assignments.day10;

import java.util.Comparator;

public class SortByAge implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

	

}
