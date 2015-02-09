package com.amos.factory;

public class BroomFactory extends VehicleFactory{

	@Override
	public Moveable Create() {
		return new Broom();
	}

}
