package com.onebill.corejava.assignments.day7;

import java.io.*;
import java.util.Scanner;

public class TryWithResourcce {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		try (Scanner scanner = new Scanner(new File("testRead.txt"));
				PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		}
	}
}