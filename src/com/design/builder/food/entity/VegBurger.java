package com.design.builder.food.entity;

import com.design.builder.food.Burger;

public class VegBurger extends Burger{


	@Override
	public String name() {
		return "vegburger";
	}

	@Override
	public float price() {
		return 20.5f;
	}

}
