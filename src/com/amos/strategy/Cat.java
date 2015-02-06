package com.amos.strategy;

public class Cat extends Comparable{
	private int height;
	private int weight;
	private Comparator comparator = new CatHeightComparator();
	
	public Comparator getComparator() {
		return comparator;
	}

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}

	public Cat(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	@Override
	public String toString() {

		return height + "|" + weight;
	}

	@Override
	int Compare(Object obj) {
		if(obj instanceof Cat){
			return comparator.Compare(this, obj);
		}else {
			try {
				throw new Exception("对象必须是Cat类型的!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
