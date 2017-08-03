package com.design.decorator.test;

import com.design.decorator.pinterface.Condiment;
import com.design.decorator.pinterface.Humburger;
import com.design.decorator.pinterface.impl.ChickenBurger;
import com.design.decorator.pinterface.impl.Hotdog;
import com.design.decorator.pinterface.impl.Lettuce;

public class Test {
	public static void main(String[] args){
		Humburger burger = new ChickenBurger();
		System.out.println(burger.getName() + "  " + burger.getMoney() + "$");
		Condiment lettuce = new Lettuce(burger);
		System.out.println(lettuce.getName() + "  " + lettuce.getMoney() + "$");
		Condiment hotdog = new Hotdog(burger);
		System.out.println(hotdog.getName() + "  " + hotdog.getMoney() + "$");
		
		
		Condiment condiment = new Lettuce(new Hotdog(new ChickenBurger()));
		System.out.println(condiment.getName() + "   " + condiment.getMoney());
	}
}
