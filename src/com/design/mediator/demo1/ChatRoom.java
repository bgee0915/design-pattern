package com.design.mediator.demo1;

public class ChatRoom {
	public static void showChar(User user,String message) {
		System.out.println(" --- [" + user.getUserName() + "] say :" + message);
	}
}
