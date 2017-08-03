package com.design.facade.demo1;

public class FacadeDemo {
	private Circle circle;
	private Rectangle rectangle;
	
	public FacadeDemo(){
		circle = new Circle();
		rectangle = new Rectangle();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
}
