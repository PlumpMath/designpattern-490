package com.amos.state;

public class Test {
	public static void main(String[] args) {
		Girl g = new Girl();
		State state = new UnhappyState();
		g.setState(state);
		g.cry();
		g.say();
		g.smile();
	}
}
