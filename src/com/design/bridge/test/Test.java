package com.design.bridge.test;

import com.design.bridge.brdge.PinkCircle;
import com.design.bridge.brdge.RedCircle;
import com.design.bridge.shape.Circle;
import com.design.bridge.shape.Shape;

public class Test {
	public static void main(String[] args){
		Shape red = new Circle(1,2,3, new RedCircle());
		red.draw();
		Shape pink = new Circle(3,2,1 ,new PinkCircle());
		pink.draw();
	}
}
