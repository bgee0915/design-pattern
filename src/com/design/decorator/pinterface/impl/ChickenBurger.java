package com.design.decorator.pinterface.impl;

import com.design.decorator.pinterface.Humburger;


/**
 * 鸡肉汉堡 (被装饰者具体类 )
 * @author lx
 *
 */
public class ChickenBurger implements Humburger{

	@Override
	public String getName() {
		return "鸡肉汉堡";
	}

	@Override
	public double getMoney() {
		return 10d;
	}

}
