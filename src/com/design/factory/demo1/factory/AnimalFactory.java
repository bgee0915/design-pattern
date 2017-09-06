package com.design.factory.demo1.factory;

import com.design.factory.demo1.animal.Animal;

public class AnimalFactory {
	public static Animal getInstance(String className) {
		Animal animal = null;
		try {
			animal = (Animal) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return animal;
	}
}
