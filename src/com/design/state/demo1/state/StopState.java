package com.design.state.demo1.state;

import com.design.state.demo1.context.Context;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
		System.out.println("change state: stop");
	}

	@Override
	public String getState() {
		return "stop";
	}
	

}
