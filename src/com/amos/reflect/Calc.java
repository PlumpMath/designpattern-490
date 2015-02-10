package com.amos.reflect;

public class Calc {
	int a;
	int b;

	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add(int a, int b) {
		
		System.out.println("a+b:" + (a + b));
		
		return a + b;
	}

	public int sub(int a, int b) {
		System.out.println("a-b:" + (a - b));
		return a - b;
	}

}
