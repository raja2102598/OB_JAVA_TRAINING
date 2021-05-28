package com.onebill.corejava.multithread;

public class RunnableThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+ " "+ i);
		}
	}
	
	

}
