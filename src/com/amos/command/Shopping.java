package com.amos.command;

public class Shopping extends Command{

	@Override
	void execute() {
		System.out.println("shopping ....");
	}

	@Override
	void unDo() {
		System.out.println("undo shopping ....");
	}

}
