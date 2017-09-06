package com.design.factory.demo1.test;

import java.util.Properties;

import com.design.factory.demo1.animal.Animal;
import com.design.factory.demo1.factory.AnimalFactory;
import com.design.factory.demo1.factory.InitProperties;

public class Test {
	public static void main(String[] args) {
		
//		获取 properties 文件对象
		Properties properties = InitProperties.getProperties();
		
//		获取 key 相对应的 value   如果不存在会 NullPointException
		String properPara = properties.getProperty("loong");
		System.out.println("properPara:  " + properPara);
		
//		Animal 工厂根据 properPara 通过反射实例化 相对应的对象
		Animal animal = AnimalFactory.getInstance(properPara);
		animal.sleep();
		
		
		
	}
}
