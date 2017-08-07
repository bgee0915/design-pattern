package com.design.state.demo2.context;

import com.design.state.demo2.state.Water;

public class Context {
	private Water water;
	
	public Context() {
		water = null;
	}
	
	public void setWater(Water water) {
		this.water = water;
	}
	
	public Water getWater() {
		return this.water;
	}
}
