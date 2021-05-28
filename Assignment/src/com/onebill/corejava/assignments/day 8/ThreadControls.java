package com.onebill.corejava.assignments.day8;

class ThreadControl extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class ThreadControls {

	public static void main(String[] args) {
		ThreadControl t1=new ThreadControl();
		ThreadControl t2=new ThreadControl();
		ThreadControl t3=new ThreadControl();
		t2.start();
		t3.start();
		t2.stop();
		try {
			t1.start();
			t1.suspend();
			t1.sleep(5000);
			t1.resume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
