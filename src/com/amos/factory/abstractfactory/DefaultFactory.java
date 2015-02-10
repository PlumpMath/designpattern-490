package com.amos.factory.abstractfactory;

public class DefaultFactory extends AbstractFactory {

	@Override
	void CreateWeapon() {
		new Gun().run();
	}

	@Override
	void CreateFood() {
		new Apple().run();
	}

	@Override
	void CreateVehicle() {
		new Car().run();
	}

}
