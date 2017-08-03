package com.design.builder.test;

import com.design.builder.meal.Meal;
import com.design.builder.meal.MealBuilder;

public class Test {
	public static void main(String[] args){
		Meal cpMeal = MealBuilder.ChickenBurgerAndPepsi();
		cpMeal.show().cost();
		System.out.println();
		Meal vcMeal = MealBuilder.VegBurgerAndCoke();
		vcMeal.show().cost();
	}
}
