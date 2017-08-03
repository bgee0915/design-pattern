package com.design.builder.packing.impl;

import com.design.builder.packing.Packing;

/**
 * 瓶装
 * @author lx
 *
 */
public class Bottle implements Packing{

	@Override
	public String pack() {
		return "bottle";
	}

}
