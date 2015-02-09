package com.amos.factory;

public class Test {
	public static void main(String[] args) {
//		Car c = Car.newInsatance();
//		Car c2 = Car.newInsatance();
//
//		System.out.println(c == c2);
//		c.run();

		
//		Moveable m = new Plane();
//		m.run();
		
//		PlaneFactory planeFactory = new PlaneFactory();
//		Moveable m =planeFactory.cratePlane();
		
		
		VehicleFactory factory = new CarFactory();
		Moveable moveable = factory.Create();
		moveable.run();
		
		
		
		
		
	}
}
