package com.onebill.corejava.basics.day2;

public class GarabageTest {
	public static void main(String[] args) {
		GarabageTest g1=new GarabageTest();
		GarabageTest g2=new GarabageTest();
		g1=null;
		System.gc();
		g2=null;
		Runtime.getRuntime().gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Throwed");
	}
}
