package com.design.builder.food.entity;

import com.design.builder.food.CodeDrink;

public class Pepsi extends CodeDrink{

	@Override
	public String name() {
		return "pepsi";
	}

	@Override
	public float price() {
		return 4.0f;
	}

}
