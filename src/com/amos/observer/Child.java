package com.amos.observer;

class Parent implements Runnable {
	private static Child c;

	public Parent(Child c) {
		this.c = c;
	}

	@Override
	public void run() {

		while (!c.isWakeUp()) {
			try {
				Thread.sleep(1000);
				System.out.println("sleeping...");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		c.feed();

	}
}

public class Child {

	private boolean wakeUp = false;

	public void wakeUp() {
		System.out.println("child is wake up ....");
		wakeUp = true;
	}

	public void feed() {
		System.out.println("feed child ....");
	}

	public boolean isWakeUp() {
		return wakeUp;
	}

	public static void main(String[] args) {
		Child c = new Child();
		Thread thread = new Thread(new Parent(c));
		thread.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.wakeUp();
		
		
	}
}
