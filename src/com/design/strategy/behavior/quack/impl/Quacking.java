package com.design.strategy.behavior.quack.impl;

import com.design.strategy.behavior.quack.QuackBehavior;

public class Quacking implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quacking | quack | 嘿， 伙计！ 要不要来只煌上煌酱鸭");
	}

}
