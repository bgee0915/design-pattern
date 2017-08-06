package com.design.mediator.demo2.mediator;

import com.design.mediator.demo2.collegue.Collegue;

public interface Mediator {
	
	public abstract Mediator send(Collegue collegue);
	
	public abstract Mediator add(Collegue collegue);
}
