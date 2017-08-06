package com.design.mediator.demo3.collegue;

import com.design.mediator.demo3.meditor.Mediator;

public abstract class User {
	private String name;
	private Mediator mediator;
	
	public User(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sendMsg(String message) {
		System.out.println(this.name + "： " + message);
		mediator.notify(this,message);
	}
	
	public void getMsg(String message) {
		System.out.println(this.name + " 接受到消息：  " + message);
	}
	
//	System.out.println(this.name + " ");
	
	
}
