package com.onebill.corejava.assignments.day8;

public class Quiz3ObjectCreation {

	public static void main(String[] args) {
//		Quiz3 obj=new Quiz3();
		try {
			Quiz3 obj=Quiz3.class.newInstance();
			obj.display();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
