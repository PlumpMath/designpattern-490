package com.amos.command;

public class DoHouseWork extends Command{

	@Override
	void execute() {
		System.out.println("DoHouseWork.....");
	}

	@Override
	void unDo() {
		System.out.println("undo DoHouseWork.....");
	}

}
