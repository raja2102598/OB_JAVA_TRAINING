package com.onebill.corejava.assignments.day10;

import java.util.Comparator;

public class SortByName implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	

}
