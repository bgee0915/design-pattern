package com.design.state.demo1.state;

import com.design.state.demo1.context.Context;

public interface State {
	public void doAction(Context context);
	
	public String getState();
}	
