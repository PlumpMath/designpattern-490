package com.amos.state;

public class UnhappyState extends State{

	@Override
	void smile() {
		System.out.println("unhappy smile ...  >_<");
	}

	@Override
	void cry() {
		System.out.println("unhappy cry ...  ");
	}

	@Override
	void say() {
		System.out.println("unhappy say ... ");
	}


}
