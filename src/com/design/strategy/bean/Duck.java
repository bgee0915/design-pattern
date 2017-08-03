package com.design.strategy.bean;

import com.design.strategy.behavior.fly.FlyBehavior;
import com.design.strategy.behavior.quack.QuackBehavior;

/**
 * 鸭子基类
 * @author lx
 *
 */
public abstract class Duck {
	
	public QuackBehavior quackBehavior;
	public FlyBehavior flyBehavior;

	public abstract Duck display();

	/**
	 * 执行飞行的方法，具体的实现由 实现 FlyBehavior 的类决定
	 */
	public Duck performFly(){
		flyBehavior.fly();
		return this;
	}
	
	/**
	 * 执行叫的方法，具体的实现由 实现 QuackBehavior 的类决定
	 */
	public Duck performQuack(){
		quackBehavior.quack();
		return this;
	}
	
	
	

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}


	public Duck setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
		return this;
	}


	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}


	public Duck setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
		return this;
	}
}
