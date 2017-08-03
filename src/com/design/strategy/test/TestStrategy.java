package com.design.strategy.test;

import com.design.strategy.bean.Duck;
import com.design.strategy.bean.MuteDuck;
import com.design.strategy.bean.RedDuck;
import com.design.strategy.behavior.fly.impl.FlyNoWay;
import com.design.strategy.behavior.fly.impl.Flying;
import com.design.strategy.behavior.quack.impl.Mute;
import com.design.strategy.behavior.quack.impl.Quacking;

public class TestStrategy {
	public static void main(String[] args){
		
		Duck redDuck = new RedDuck();
		
		redDuck.display()
		.setFlyBehavior(new FlyNoWay())
		.setQuackBehavior(new Quacking())
		.performFly()
		.performQuack();
		
		
		System.out.println("-------------------");
		
		Duck muteDuck = new MuteDuck();
		muteDuck.display()
		.setFlyBehavior(new Flying())
		.setQuackBehavior(new Mute())
		.performFly()
		.performQuack();
		
		
	}
}
