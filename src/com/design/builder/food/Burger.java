package com.design.builder.food;

import com.design.builder.item.Item;
import com.design.builder.packing.Packing;
import com.design.builder.packing.impl.Bottle;

public abstract class Burger implements Item{
	
	public Packing packing(){
		return new Bottle();
	} 
}
