package com.onebill.corejava.multithread;

public class Tables {
	public /*synchronized for sync menthod*/ void printTable(int number) {
		for(int i=1;i<=10;i++) {
			System.out.println(i*number);
		}
	}
}
