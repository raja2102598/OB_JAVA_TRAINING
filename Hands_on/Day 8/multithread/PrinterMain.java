package com.onebill.corejava.multithread;

class Printer {
	void printDocuments(int copies, String docName) {// use synchronized keyword to synchronize a method
		for (int i = 1; i <= copies; i++) {
			System.out.println("Printing Documents ........" + docName + " " + i);
		}
	}
}

class ThreadJob1 extends Thread {
	Printer printerRef;

	public ThreadJob1(Printer p) {// constructor
		printerRef = p;
	}

	public void run() {
		synchronized (printerRef) {
			printerRef.printDocuments(10, "Job1.pdf");
		}
	}
}

class ThreadJob2 extends Thread {
	Printer printerRef;

	public ThreadJob2(Printer p) {
		printerRef = p;
	}

	public void run() {
		synchronized (printerRef) {
			printerRef.printDocuments(15, "Job2.pdf");
		}
	}
}

public class PrinterMain {

	public static void main(String[] args) {
		Printer printer = new Printer();
		ThreadJob1 t1 = new ThreadJob1(printer);
		ThreadJob2 t2 = new ThreadJob2(printer);
		t1.start();
		t2.start();
	}

}
