package com.amos.factory.abstractfactory;

public class MagicFactory extends AbstractFactory {

	@Override
	void CreateWeapon() {
		new MagicStick().run();
	}

	@Override
	void CreateFood() {
		new MagicFood().run();
	}

	@Override
	void CreateVehicle() {
		new Broom().run();
	}

}
