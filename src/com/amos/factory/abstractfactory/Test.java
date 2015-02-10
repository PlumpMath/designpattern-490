package com.amos.factory.abstractfactory;

public class Test {
	public static void main(String[] args) {

		AbstractFactory factory = new DefaultFactory();//new MagicFactory();
		factory.CreateFood();
		factory.CreateVehicle();
		factory.CreateWeapon();
	}
}
