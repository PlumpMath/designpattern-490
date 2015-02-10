package com.amos.factory;


public class Car implements Moveable {

	public void run() {
		System.out.println("汽车正在路上跑....");
	}

	// private Car() {
	// }

	public Car() {
	}

	// 单例模式
	private static Car car;

	// 多例模式 --连接池
//	private static List<Car> cars = new ArrayList<Car>();

	public static Car newInsatance() {

		if (car == null) {
			car = new Car();
		}

		return car;
		// return cars.get(0);
	}

}
