package com.design.state.demo2.state;

import com.design.state.demo2.context.Context;

public class WarmWater implements Water{

	@Override
	public Context temperature(Context context) {
		context.setWater(this);
		System.out.println("water temperature --- warm");
		return context;
	}

	@Override
	public String waterState() {
		return "warm";
	}

}
