package com.design.prototype.shape;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String,Shape> table = new Hashtable<String,Shape>();
	
	public static Shape getShape(String id){
		Shape shape = table.get(id);
		return (Shape)shape.clone();
	}
	
	public static void loadCache(){
		Shape circle = new Circle();
		table.put(circle.getId(), circle);
		
		Shape rectangle = new Rectangle();
		table.put(rectangle.getId(), rectangle);
		
	}
}
