package com.design.factory.demo1.test;

import java.util.Properties;

import com.design.factory.demo1.animal.Animal;
import com.design.factory.demo1.factory.AnimalFactory;
import com.design.factory.demo1.factory.InitProperties;

public class Test {
	public static void main(String[] args) {
		Properties properties = InitProperties.getProperties();
		Animal animal = AnimalFactory.getInstance(properties.getProperty("dog"));
		animal.sleep();
		
	}
}
