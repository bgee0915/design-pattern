package com.design.bridge.shape;

import com.design.bridge.brdge.DrawAPI;

public class Circle extends Shape{
	private int x, y, r;
	public Circle(int x, int y, int r, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public void draw() {
		drawAPI.draw(x, y, r);
	}

}
