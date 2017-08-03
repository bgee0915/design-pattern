package com.design.strategy.bean;

public class RedDuck extends Duck{

	@Override
	public Duck display() {
		System.out.println("本鸭是红色的啦");
		return this;
	}
	
	

}
