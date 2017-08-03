package com.design.builder.meal;

import java.util.ArrayList;
import java.util.List;

import com.design.builder.item.Item;

/**
 * 实现具体包装过程的类
 * @author lx
 *
 */
public class Meal {
	private List<Item> list = new ArrayList<Item>();
	
	public Meal addItem(Item item){
		list.add(item);
		return this;
	}
	
	public Meal show(){
		for(Item item : list){
			System.out.println("food name: " + item.name());
			System.out.println("food pack: " + item.packing().pack());
			System.out.println("food cost: " + item.price());
		}
		return this;
	}
	
	public Meal cost(){
		float cost = 0.0f;
		for(Item item : list){
			cost += item.price();
		}
		System.out.println("food cost all: " + cost);
		return this;
	}
	
	
}
