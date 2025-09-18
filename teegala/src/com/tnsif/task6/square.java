package com.tnsif.task6;

public class square extends shape{
	private int side=2;
	public square (int side) {
		this.side=side;
		
	}
	void calculatearea()
	{
		super.area=side*side;
	}

}
