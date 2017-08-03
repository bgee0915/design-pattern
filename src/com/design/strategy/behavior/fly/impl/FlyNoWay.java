package com.design.strategy.behavior.fly.impl;

import com.design.strategy.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("FlyNoWay | fly | 我是真的不会飞啊 喂！");
	}

}
