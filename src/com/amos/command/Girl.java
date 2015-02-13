package com.amos.command;

public class Girl {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Command(Boy boy){
		boy.doSomething();
		boy.unDo();
	}
	
}
