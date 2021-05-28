package com.onebill.corejava.assignments.day8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *  a group of fixed size threads are created. A thread from the thread pool is pulled out and assigned a job by the service provider. 
 *  After completion of the job, thread is contained in the thread pool again.
 */
class WorkerThread implements Runnable {
	private int value;

	public WorkerThread(int s) {
		this.value = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + "value : " + value);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPool {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread(i);
			executor.execute(worker);// calling execute method of ExecutorService
		}
		executor.shutdown();
		while (!executor.isTerminated()) {

		}
		System.out.println("Finished all threads");

	}

}
