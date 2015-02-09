package com.amos.factory;

import java.util.ArrayList;
import java.util.List;

public class Car implements Moveable {
	
	public void run() {
		System.out.println("车正在路上跑....");
	}

	private Car() {
	}

	// 单例模式
	private static Car car;

	// 多例模式 --连接池
	private static List<Car> cars = new ArrayList<Car>();

	public static Car newInsatance() {

		if (car == null) {
			car = new Car();
		}

		return car;
		// return cars.get(0);
	}

}
