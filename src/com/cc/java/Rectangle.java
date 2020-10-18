package com.cc.java;

public class Rectangle extends Shape{

	private double height, width;
	
	/**
	 * @param height
	 * @param width
	 */
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}


	public double diagonal() {
		return Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
	}

	
	
	
}
