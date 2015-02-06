package com.amos.strategy;

public class StrategyTest {

	public static void main(String[] args) {
		// int array[] = {3,5,8,2,4,11};
		// Cat[] array = new Cat[]{new Cat(1,1),new Cat(9,9),new Cat(5,2)};

		Cat c1 = new Cat(1, 3);
		c1.setComparator(new CatWeightComparator());

		Cat c2 = new Cat(9, 9);
		c1.setComparator(new CatWeightComparator());

		Cat c3 = new Cat(5, 2);
		c1.setComparator(new CatWeightComparator());
	
		Cat[] array = new Cat[] { c1, c2, c3 };

		
		
		
		DataSorter.Sort(array);
		DataSorter.Print(array);
		
		
		
		
	}
}
