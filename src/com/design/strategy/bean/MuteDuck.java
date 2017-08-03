package com.design.strategy.bean;

public class MuteDuck extends Duck{

	@Override
	public Duck display() {
		System.out.println("鸭： 我大概是一只不能说话的废鸭了");
		return this;
	}

}
