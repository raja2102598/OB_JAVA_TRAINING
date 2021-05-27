package com.onebill.corejava.multithread;

class MultithreadRunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getId() +"is running.");
	}
	
}

public class MultithreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			Thread obj=new Thread(new MultithreadRunnable1());
			obj.start();
		}
	}

}
