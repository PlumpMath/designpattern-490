package com.amos.observer;

public class Child2 implements Runnable {
	public Dad d;
	public Child2(Dad d){
		this.d  = d;
	}
	public void wakeUp(){
		d.feed(this);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.wakeUp();
	}
	
	public static void main(String[] args) {
		new Thread(new Child2(new Dad())).start();;
	}

}

class Dad {
	public void feed(Child2 c) {
		System.out.println("feed child ...");
	}
}
