package com.design.builder.packing.impl;

import com.design.builder.packing.Packing;

/**
 * 盒装
 * @author lx
 *
 */
public class Wrapper implements Packing{

	@Override
	public String pack() {
		return "wrapper";
	}

}
