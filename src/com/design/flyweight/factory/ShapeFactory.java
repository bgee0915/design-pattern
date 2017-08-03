package com.design.flyweight.factory;

import java.util.HashMap;
import java.util.Map;

import com.design.flyweight.bean.Circle;
import com.design.flyweight.pinterface.Shape;

public class ShapeFactory {
	private static final Map<String,Shape> map = new HashMap<String,Shape>();
	
	public static Shape getCircle(String color) {
		Circle circle = (Circle)map.get(color);
		if(null == circle) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("create new circle,  color = " + color);
		}
		return circle;
	}
}
