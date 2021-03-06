package com.amos.strategy;

public class CatHeightComparator implements Comparator {

	public int Compare(Object o1, Object o2) {
		if (o1.getClass() == o2.getClass()) {
			if (((Cat) o1).getHeight() > ((Cat) o2).getHeight())
				return 1;
			else if (((Cat) o1).getHeight() < ((Cat) o2).getHeight())
				return -1;
			else
				return 0;
		} else {
			try {
				throw new Exception("两者类型必须一致!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
