package com.design.prototype.shape;

public class Circle extends Shape{
	public Circle(){
		this.setType("circle");
		this.setId("1");
	}
	
	public void draw(){
		System.out.println("circle, draw()");
	}
}
