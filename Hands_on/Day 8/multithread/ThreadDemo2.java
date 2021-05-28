package com.onebill.corejava.multithread;

public class ThreadDemo2 extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo2 obj1=new ThreadDemo2();
		ThreadDemo2 obj2=new ThreadDemo2();
//		obj1.start();
//		obj2.start();
		obj1.run();
		obj2.run();
	}
}
