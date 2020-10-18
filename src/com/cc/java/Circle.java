package com.cc.java;

public class Circle extends Shape{

	private double radius;
	
	/**
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	public double diameter() {
		return radius*2;
	}
	
}
