package com.design.builder.food.entity;

import com.design.builder.food.CodeDrink;

public class Coke extends CodeDrink{

	@Override
	public String name() {
		return "coke";
	}

	@Override
	public float price() {
		return 5.0f;
	}

}
