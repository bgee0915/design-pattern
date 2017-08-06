package com.design.mediator.demo3.meditor;

import com.design.mediator.demo3.collegue.User;

public interface Mediator {
	public void notify(User user,String message);
	
	public void register(User user);
}
