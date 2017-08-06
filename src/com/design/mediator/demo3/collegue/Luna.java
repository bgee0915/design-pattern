package com.design.mediator.demo3.collegue;

import com.design.mediator.demo3.meditor.Mediator;

public class Luna extends User{

	public Luna(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(this);
	}

}
