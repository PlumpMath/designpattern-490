package com.amos.command;

import java.util.ArrayList;
import java.util.List;

public class Boy {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	List<Command> commands = new ArrayList<Command>();

	List<Command> undoCommands = new ArrayList<Command>();
	
	
	public void doSomething() {
		commands.add(new Shopping());
		commands.add(new DoHouseWork());
	
		for (Command command : commands) {
			undoCommands.add(command);
			command.execute();
		}
	}
	
	public void unDo(){
		for(int i=undoCommands.size()-1;i>=0;i--){
			undoCommands.get(i).unDo();;
		}
		
	}
	
	
	
}
