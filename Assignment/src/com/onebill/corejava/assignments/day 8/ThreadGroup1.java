package com.onebill.corejava.assignments.day8;

class ThreadGroupEx implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}

public class ThreadGroup1 {
	public static void main(String[] args) {
		ThreadGroupEx obj = new ThreadGroupEx();
		ThreadGroup group = new ThreadGroup("Group 1");
		Thread t1 = new Thread(group, obj, "T1");
		t1.start();
		Thread t2 = new Thread(group, obj, "T2");
		t2.start();
		Thread t3 = new Thread(group, obj, "T3");
		t3.start();
		Thread t4 = new Thread(group, obj, "T4");
		t4.start();
	}
}
