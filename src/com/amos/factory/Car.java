package com.amos.factory;

import java.util.ArrayList;
import java.util.List;

public class Car implements Moveable {
	
	public void run() {
		System.out.println("������·����....");
	}

	private Car() {
	}

	// ����ģʽ
	private static Car car;

	// ����ģʽ --���ӳ�
	private static List<Car> cars = new ArrayList<Car>();

	public static Car newInsatance() {

		if (car == null) {
			car = new Car();
		}

		return car;
		// return cars.get(0);
	}

}
