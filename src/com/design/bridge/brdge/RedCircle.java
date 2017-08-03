package com.design.bridge.brdge;

public class RedCircle implements DrawAPI{

	@Override
	public void draw(int x, int y, int r) {
		System.out.println("red circle draw, x=" + x+ ", y=" + y + ", r=" + r);
	}
	
}
