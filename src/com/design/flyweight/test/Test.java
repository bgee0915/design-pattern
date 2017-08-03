package com.design.flyweight.test;

import java.util.Random;

import com.design.flyweight.bean.Circle;
import com.design.flyweight.factory.ShapeFactory;

public class Test {
	static final String []colorArray = {"red","orange","yellow","green","blue","pink","zi"};
	static final Random random = new Random();
	
	public static void main(String[] args) {
		for(int i=0; i<30; i++) {
			Circle circle = (Circle)ShapeFactory.getCircle(getColor());
			circle.draw();
		}
		
	}
	
	static String getColor() {
		return colorArray[random.nextInt(colorArray.length)];
	}
	
	static int getN() {
		return random.nextInt(334);
	}
}
