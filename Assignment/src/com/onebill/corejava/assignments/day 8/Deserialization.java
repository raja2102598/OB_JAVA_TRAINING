package com.onebill.corejava.assignments.day8;

import java.io.*;

/*
 * Deserialization is the process of reconstructing the object from the serialized state. It is the reverse operation of serialization.
 * 
 */

public class Deserialization {
	public static void main(String[] args) {
		try {
			// Creating ObjectInputStream object and reading the serialized student object
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("Student.txt"));
			Student s = (Student) o.readObject();
			// printing the data of the serialized object
			System.out.println("Id: " + s.id + "\nName : " + s.name + "\nAge : " + s.age + "\nAddress : " + s.address);
			o.close();
			
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}

