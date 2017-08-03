package com.design.builder.food;

import com.design.builder.item.Item;
import com.design.builder.packing.Packing;
import com.design.builder.packing.impl.Wrapper;

public abstract class CodeDrink implements Item{
	
	public Packing  packing(){
		return new Wrapper();
	}
}
