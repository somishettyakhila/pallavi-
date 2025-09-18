package com.tnsif.task6;

public class rectangle extends shape {
	private int height=9, width=3;
	public rectangle(int height,int width) {
		this.height=height;
		this.width=width;
				
	}
	void calculatearea() {
		super.area=height*width;
	}
	

}
