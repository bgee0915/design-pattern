package com.design.strategy.behavior.fly.impl;

import com.design.strategy.behavior.fly.FlyBehavior;

public class Flying implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Flying | fly | 飞起来 浪起来 和太阳并肩起来！ ");
	}

}
