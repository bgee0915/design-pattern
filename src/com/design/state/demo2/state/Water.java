package com.design.state.demo2.state;

import com.design.state.demo2.context.Context;

public interface Water {
	public Context temperature(Context context);
	
	public String waterState() ;
}
