package com.amos.state;

public class Girl {
	private String name;
	private State state = new HappyState();
	public String getName() {
		return name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void smile() {
		state.smile();
	}

	public void cry() {
		state.cry();
	}

	public void say(){
		state.say();
	}

	
}
