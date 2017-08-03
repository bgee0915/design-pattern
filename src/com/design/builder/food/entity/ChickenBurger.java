package com.design.builder.food.entity;

import com.design.builder.food.Burger;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "chickenburger";
	}

	@Override
	public float price() {
		return 25.5f;
	}

}
