package com.design.mediator.demo3.collegue;

import com.design.mediator.demo3.meditor.Mediator;

public class Jam extends User{

	public Jam(String name, Mediator mediator) {
		super(name, mediator);
		mediator.register(this);
	}

}
