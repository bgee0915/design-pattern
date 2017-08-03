package com.design.bridge.shape;

import com.design.bridge.brdge.DrawAPI;

public abstract class Shape {
	protected DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
}
