package com.amos.factory;

public class PlaneFactory extends VehicleFactory{

//	public Plane cratePlane() {
//		return new Plane();
//	}

	@Override
	public Moveable Create() {
		return  new Plane();
	}

}
