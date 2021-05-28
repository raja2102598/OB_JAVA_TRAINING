package com.onebill.corejava.multithread;

class MultithreadExtends1 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread "+Thread.currentThread().getId() +"is running.");
	}
	
}

public class MultiThreadExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			MultithreadExtends1 obj=new MultithreadExtends1();
			obj.start();
		}
	}

}
