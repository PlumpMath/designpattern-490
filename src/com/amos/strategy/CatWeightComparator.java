package com.amos.strategy;

public class CatWeightComparator implements Comparator<Cat> {

	@Override
	public int Compare(Cat o1, Cat o2) {
			if (o1.getWeight() > o2.getWeight())
				return 1;
			else if (o1.getWeight() < o2.getWeight())
				return -1;
			else
				return 0;
	}

//	public int Compare(Object o1, Object o2) {
//		if (o1.getClass() == o2.getClass()) {
//			if (((Cat) o1).getWeight() > ((Cat) o2).getWeight())
//				return 1;
//			else if (((Cat) o1).getWeight() < ((Cat) o2).getWeight())
//				return -1;
//			else
//				return 0;
//		} else {
//			try {
//				throw new Exception("两者类型必须一致!");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		return 0;
//	}
	
	
	
}
