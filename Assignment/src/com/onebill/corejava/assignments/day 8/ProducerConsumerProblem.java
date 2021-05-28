package com.onebill.corejava.assignments.day8;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Manage m = new Manage();
		Producer p = new Producer(m, 1);
		Consumer c = new Consumer(m, 1);
		p.start();
		c.start();
	}
}

class Manage {
	int contents;
	boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}

class Consumer extends Thread {
	private Manage manage;
	private int number;

	public Consumer(Manage m, int number) {
		this.manage = m;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = manage.get();
			System.out.println("Consumer #" + this.number + " got: " + value);
		}
	}
}

class Producer extends Thread {
	private Manage manage;
	private int number;

	public Producer(Manage m, int number) {
		this.manage = m;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			manage.put(i);
			System.out.println("Producer #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
