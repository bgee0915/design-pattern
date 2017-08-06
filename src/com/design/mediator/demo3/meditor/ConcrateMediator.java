package com.design.mediator.demo3.meditor;

import java.util.ArrayList;
import java.util.List;

import com.design.mediator.demo3.collegue.User;

public class ConcrateMediator implements Mediator{
	List<User> userList = new ArrayList<User>();
	
	
	@Override
	public void notify(User user, String message) {
		for(User users : userList) {
			if(users.equals(user)) {
				
			}else {
				users.getMsg(message);
			}
		}
	}
	
	@Override
	public void register(User user) {
		if(null != user && !userList.contains(user)) {
			userList.add(user);
		}
	}

}
