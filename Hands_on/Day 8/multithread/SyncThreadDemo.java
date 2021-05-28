package com.onebill.corejava.multithread;

public class SyncThreadDemo {

	public static void main(String[] args) {
		Tables table = new Tables();
		Runnable ref1 = () -> {
			synchronized (table) {
				table.printTable(2);
			}
		};
		Runnable ref2 = () -> {
			synchronized (table) {
				table.printTable(4);
			}
		};
		Thread t1 = new Thread(ref1);
		Thread t2 = new Thread(ref2);
		t1.start();
		t2.start();
	}
}
