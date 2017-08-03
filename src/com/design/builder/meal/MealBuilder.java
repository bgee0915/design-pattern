package com.design.builder.meal;

import com.design.builder.food.entity.ChickenBurger;
import com.design.builder.food.entity.Coke;
import com.design.builder.food.entity.Pepsi;
import com.design.builder.food.entity.VegBurger;

/**
 * 组合类 将不同食物搭配组合
 * @author lx
 *
 */
public class MealBuilder {
	public static Meal VegBurgerAndCoke(){
		return new Meal().addItem(new VegBurger()).addItem(new Coke());
	}
	
	public static Meal ChickenBurgerAndPepsi(){
		return new Meal().addItem(new ChickenBurger()).addItem(new Pepsi());
	}
}
