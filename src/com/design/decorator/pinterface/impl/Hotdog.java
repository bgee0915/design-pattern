package com.design.decorator.pinterface.impl;

import com.design.decorator.pinterface.Condiment;
import com.design.decorator.pinterface.Humburger;

/**
 * 热狗类 (具体装饰者2)
 * @author lx
 *
 */
public class Hotdog implements Condiment{
	Humburger humburger;
	
	public Hotdog(Humburger humburger){
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return this.humburger.getName() + " 加热狗 ";
	}

	@Override
	public double getMoney() {
		return this.humburger.getMoney() + 2;
	}

}
