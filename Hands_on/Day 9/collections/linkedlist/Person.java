package com.onebill.corejava.collections.linkedlist;

public class Person implements Comparable<Person> {
	int id;
	String name;
	String chararter;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public Person(int id, String name,String character) {
		super();
		this.id = id;
		this.name = name;
		this.chararter=character;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChararter() {
		return chararter;
	}
	public void setChararter(String chararter) {
		this.chararter = chararter;
	}
	@Override
	public int compareTo(Person o) {
//		return this.id-o.id;//decending order
		return o.id-this.id;//ascending order
	}
	@Override
	public int hashCode() {
		return this.id;
	}
}