package com.design.bridge.brdge;

public class PinkCircle implements DrawAPI{

	@Override
	public void draw(int x, int y, int r) {
		System.out.println("pink circle draw, x=" + x + ", y=" + y + ", r=" + r);
	}

}
