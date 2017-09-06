package com.design.factory.demo1.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class InitProperties {
	
//	获取 properties 对象
	public static Properties getProperties() {
		
		Properties properties = new Properties();
		File file = new File("animal.properties");
		
		if(file.exists()) {
			InputStream input = null;
			try {
				input = new FileInputStream(file);
				properties.load(input);
			} catch (IOException ioe) {
				ioe.printStackTrace();
				return null;
			} finally {
				
				try {
					input.close();
				} catch (IOException eclose) {
					eclose.printStackTrace();
					return null;
				}
			}
			
			return properties;
		}
		
//		如果不存在 properties 则新建一个
//		初始化数据
		properties.put("dog", "com.design.factory.demo1.animal.Dog");
		properties.put("loong", "com.design.factory.demo1.animal.Loong");
		
		OutputStream out = null;
		try {
			out = new FileOutputStream(file);
			properties.store(out, "test"); // test xx.properties 内的注释
		} catch (IOException oute) {
			oute.printStackTrace();
			return null;
		} finally {
			try {
				out.close();
			} catch (IOException eclose) {
				eclose.printStackTrace();
				return null;
			}
		}
		
		return properties;
	}
	
	
}
