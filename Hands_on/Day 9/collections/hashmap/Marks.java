package com.onebill.corejava.collections.hashmap;

public class Marks {
	
	int mathMarks;
	
	public Marks() {
		this.mathMarks=(int) Math.random()*100;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	
}
