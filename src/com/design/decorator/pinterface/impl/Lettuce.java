package com.design.decorator.pinterface.impl;

import com.design.decorator.pinterface.Condiment;
import com.design.decorator.pinterface.Humburger;


/**
 * 生菜 (具体装饰者类  1)  
 * @author lx
 *
 */
public class Lettuce implements Condiment{
	
	Humburger humburger;
	public Lettuce(Humburger humburger){
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName() + " 加生菜 ";
	}

	@Override
	public double getMoney() {
		return humburger.getMoney() + 1;
	}

}
