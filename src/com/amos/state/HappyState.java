package com.amos.state;

public class HappyState extends State{

	@Override
	void smile() {
		System.out.println("happy smile ...  ^_^");
	}

	@Override
	void cry() {
		System.out.println("happy cry ...  ");
	}

	@Override
	void say() {
		System.out.println("happy say ... ");
	}

}
