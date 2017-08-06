package com.design.mediator.demo1;

public class User {
	private String userName;
	
	public String getUserName() {
		return this.userName;
	}
	
	public User setUserName(String userName) {
		this.userName = userName;
		return this;
	}
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public void sendMessage(String message) {
		ChatRoom.showChar(this, message);
	}
}
