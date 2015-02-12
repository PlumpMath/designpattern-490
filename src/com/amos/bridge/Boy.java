package com.amos.bridge;

public class Boy {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void pursue(Girl girl, Gift gift) {
		gift = new WarmGift(new Flower());
	}
}
