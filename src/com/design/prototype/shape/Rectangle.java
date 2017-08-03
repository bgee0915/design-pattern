package com.design.prototype.shape;

public class Rectangle extends Shape{
	public Rectangle(){
		this.setType("rectangle");
		this.setId("2");
	}
	
	public void draw(){
		System.out.println("rectangle, draw()");
	}
}
