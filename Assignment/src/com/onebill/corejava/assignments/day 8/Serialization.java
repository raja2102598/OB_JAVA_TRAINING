package com.onebill.corejava.assignments.day8;
/*
 * Serialization in Java is a mechanism of writing the state of an object 
 * into a byte-stream.
 * 
 * For serializing the object, we call the writeObject() method ObjectOutputStream, and for deserialization we call the 
 * readObject() method of ObjectInputStream class.
 * 
 * 
 */
import java.io.*;

class Student implements Serializable {//implement the Serializable interface for serializing the object.
	String name;
	static long id; //will not be serialized if it's static value
	int age;
	transient String address; //use transient keyword if you don't  want that value to be serialized

	public Student(String name, long id, int age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.address = address;

	}
}

public class Serialization {

	public static void main(String[] args) {
		Student s = new Student("Raja", 12211, 21, "Thanjavur,Tamilnadu");
		try {
			FileOutputStream fout = new FileOutputStream("Student.txt");//Creating stream  
			ObjectOutputStream o = new ObjectOutputStream(fout);
			o.writeObject(s);// writing the object
			o.flush();//flushes the current output stream.
			System.out.println("File Created");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
