package com.design.builder.item;

import com.design.builder.packing.Packing;

/**
 * 食品条目接口  相当于食品的基础接口       
 * @author lx 
 *
 */
public interface Item {
	public Packing packing();
	public String name();
	public float price();
}
