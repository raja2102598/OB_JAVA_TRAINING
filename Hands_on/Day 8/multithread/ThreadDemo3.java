package com.onebill.corejava.multithread;

class MyThread implements Runnable{
	
	String threadName;
	public MyThread(String tName) {
		threadName=tName;
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(200);
				System.out.println("In "+threadName+"Count is "+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		MyThread thread1=new MyThread("Child");
		Thread t=new Thread(thread1);
		t.start();
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(200);
				System.out.println("In Main Count is "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
