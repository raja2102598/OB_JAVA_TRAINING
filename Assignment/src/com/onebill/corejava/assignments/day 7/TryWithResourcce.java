package com.onebill.corejava.assignments.day7;

import java.io.*;
import java.util.Scanner;

public class TryWithResourcce {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
				PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}