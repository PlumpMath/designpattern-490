package com.amos.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test {
	public static void main(String[] args) throws Exception {
		// /DesignPattern/src/com/amos/reflect/Calc.java
		Class<?> class1 = Class.forName("com.amos.reflect.Calc");
		Object[] objs = new Object[]{1,2};
		Object newInstance = class1.getConstructors()[0].newInstance(objs);
		class1.getMethods()[1].invoke(newInstance, objs);
	
		for (Method method : class1.getMethods()) {
			
			String name = method.getName();
			System.out.println("name:"+name);
			for(Parameter para: method.getParameters()){
				System.out.println("paras:"+para);
			}
			
//			int len = method.getParameters().length;
//			objs = new Object[len];
//			for (int i = 0; i < len; i++) {
//				objs[i] = i;
//				if (method.getParameters()[i].getType() == int.class) {
//					objs[i] = i;
//				}
//			}
//		   int result = (int)	method.invoke(newInstance, objs);
			
		}
	}
}
