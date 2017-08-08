package com.design.nil.demo1.test;

import com.design.nil.demo1.factory.CustomerFactory;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(CustomerFactory.getName("wuzi").getName());
		System.out.println(CustomerFactory.getName("li").getName());
		System.out.println(CustomerFactory.getName("alan").getName());
		System.out.println(CustomerFactory.getName("fuck").getName());
		System.out.println(CustomerFactory.getName("bob").getName());
		
	}
}
