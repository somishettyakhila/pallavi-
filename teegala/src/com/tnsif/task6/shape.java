package com.tnsif.task6;

public abstract class shape {
	protected float area;
	abstract void calculatearea();
	public void show() {
		System.out.println("The area of shape is" +area);
		
	}

}
