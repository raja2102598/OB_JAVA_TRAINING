package com.onebill.corejava.multithread;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableThread1 t1=new RunnableThread1();
		RunnableThread2 t2=new RunnableThread2();
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		th1.start();
		th2.start();
	}

}
