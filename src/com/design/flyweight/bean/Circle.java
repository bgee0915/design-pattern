package com.design.flyweight.bean;

import com.design.flyweight.pinterface.Shape;

public class Circle implements Shape{
	private float x;
	private float y;
	private float radius;
	private String color;

	public Circle(String color) {
		setColor(color);
	}
	
	public float getX() {
		return x;
	}



	public void setX(float x) {
		this.x = x;
	}



	public float getY() {
		return y;
	}



	public void setY(float y) {
		this.y = y;
	}



	public float getRadius() {
		return radius;
	}



	public void setRadius(float radius) {
		this.radius = radius;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public void draw() {
		System.out.println("Circle [x=" + x + ", y=" + y + ", radius=" + radius + ", color=" + color + "]");
	}
	
}
