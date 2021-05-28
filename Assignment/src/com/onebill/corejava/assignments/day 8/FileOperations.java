package com.onebill.corejava.assignments.day8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		//File creation
		File file=new File("Sample.properties");
		try {
			boolean res=file.createNewFile();
			if(res)
				System.out.println("File is Created");
			else
				System.out.println("Failed to create");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Writing a File
		 String data = "Doing File operations ..............";
	     try {
	       // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter("Sample.csv");

	       // Writes string to the file
	       output.write(data);
	       System.out.println("Completed");
	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }

	     
	     //Read the file
	     char[] array = new char[100];
	     try {
	       // Creates a reader using the FileReader
	       FileReader input = new FileReader("Sample.csv");

	       // Reads characters
	       input.read(array);
	       System.out.println("Data : ");
	       System.out.println(array);
	       // Closes the reader
	       input.close();
	     }
	     catch(Exception e) {
	       e.getStackTrace();
	     }
	     
	     //Append
	     
	     try {
	            FileWriter fw = new FileWriter("Sample.csv", true);
	            fw.write("Hello");
	            fw.close();
	        }
	        catch(IOException e) {
	        }
	}

}
