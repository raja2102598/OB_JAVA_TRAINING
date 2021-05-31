package com.onebill.corejava.assignments.day10;


import java.util.Scanner;
import java.util.TreeSet;

public class StudentsSorter {
	
	public static TreeSet<Students> studentsAdder(TreeSet<Students> s) {
		s.add(new Students(12,"Ganesh" , 98, 21));
		s.add(new Students(25,"Varun" , 28, 17));
		s.add(new Students(1,"Ajay" , 11, 10));
		s.add(new Students(66,"Jay" , 78, 10));
		s.add(new Students(89,"Aj" , 19, 24));
		s.add(new Students(43,"Subash" , 71, 20));
		s.add(new Students(12,"Ajith" , 22, 25));
		s.add(new Students(12,"Tony" , 89, 18));
		s.add(new Students(12,"Stark" , 76, 13));
		s.add(new Students(12,"Shark" , 21, 27));
		return s;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice \n1.Sort by id\n2.Sort by name\n3.Sort by marks\n4.Sort by Age\n");
		int ch=scan.nextInt();
		switch (ch) {
		case 1:
			TreeSet<Students> s1=new TreeSet<Students>(new SortBySId());                       
			s1=studentsAdder(s1);
			System.out.println(s1.toString());
			break;
		case 2:
			TreeSet<Students> s2=new TreeSet<Students>(new SortByName());
			s2=studentsAdder(s2);
			System.out.println(s2.toString());
			break;
		case 3:
			TreeSet<Students> s3=new TreeSet<Students>(new SortByMarks());
			s3=studentsAdder(s3);
			System.out.println(s3.toString());
			break;
		case 4:
			TreeSet<Students> s4=new TreeSet<Students>(new SortByAge());
			s4=studentsAdder(s4);
			System.out.println(s4.toString());
			break;
		default:
			System.out.println("Enter Correct choice");
			break;
		}
	}
}
