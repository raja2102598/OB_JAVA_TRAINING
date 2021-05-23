package com.onebill.corejava.basics.assignments.day2;

public class IslandOfIsolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandOfIsolation i1=new IslandOfIsolation();
		IslandOfIsolation i2=new IslandOfIsolation();
		i1=i2;
		i2=i1;
//		i1=null;
//		i2=null;
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Garbage Collected - "+this);
	}
}
