package com.design.state.demo1.context;

import com.design.state.demo1.state.State;

public class Context {
	private State state;
	
	public Context() {
		this.state = null;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return this.state;
	}
}
