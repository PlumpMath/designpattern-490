package com.amos.factory;

public class CarFactory  extends VehicleFactory{

	@Override
	public Moveable Create() {
		return new Car();
	}

}
