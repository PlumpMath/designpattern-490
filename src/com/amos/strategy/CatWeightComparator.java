package com.amos.strategy;

public class CatWeightComparator implements Comparator {

	public int Compare(Object o1, Object o2) {
		if (o1.getClass() == o2.getClass()) {
			if (((Cat) o1).getWeight() > ((Cat) o2).getWeight())
				return 1;
			else if (((Cat) o1).getWeight() < ((Cat) o2).getWeight())
				return -1;
			else
				return 0;
		} else {
			try {
				throw new Exception("�������ͱ���һ��!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
