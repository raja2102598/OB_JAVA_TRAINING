package com.onebill.corejava.assignments.day9;

public class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
//		return o.id-this.id;
//		return this.marks-o.marks;
		return this.name.compareTo(o.name);
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
