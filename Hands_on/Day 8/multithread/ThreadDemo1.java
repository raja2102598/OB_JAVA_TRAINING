package com.onebill.corejava.multithread;

public class ThreadDemo1 implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread("Thread 1");
		Thread t2=new Thread("Thread 2");
		t1.run();
		t2.run();
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());
		System.out.println(t2.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}

}
