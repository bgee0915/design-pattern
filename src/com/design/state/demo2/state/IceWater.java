package com.design.state.demo2.state;

import com.design.state.demo2.context.Context;

public class IceWater implements Water{

	@Override
	public Context temperature(Context context) {
		context.setWater(this);
		System.out.println("water temperature --- ice");
		return context;
	}
	
	public String waterState() {
		return "ice";
	}

}
