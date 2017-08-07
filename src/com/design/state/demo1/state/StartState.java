package com.design.state.demo1.state;

import com.design.state.demo1.context.Context;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("change state:  start");
		context.setState(this);
	}

	@Override
	public String getState() {
		return "start";
	}
	

}
