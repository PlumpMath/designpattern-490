package com.amos.factory;


public class Car implements Moveable {

	public void run() {
		System.out.println("��������·����....");
	}

	// private Car() {
	// }

	public Car() {
	}

	// ����ģʽ
	private static Car car;

	// ����ģʽ --���ӳ�
//	private static List<Car> cars = new ArrayList<Car>();

	public static Car newInsatance() {

		if (car == null) {
			car = new Car();
		}

		return car;
		// return cars.get(0);
	}

}
