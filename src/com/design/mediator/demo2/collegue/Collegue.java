package com.design.mediator.demo2.collegue;

import com.design.mediator.demo2.mediator.Mediator;

public abstract class Collegue {
	private Mediator mediator;
	private String message;
	
	public Collegue(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public Mediator getMediator() {
		return this.mediator;
	}
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
	/**
	 * 发送消息
	 */
	public abstract void sendMsg();
	
	/**
	 * 接收消息
	 */
	public abstract void getMsg(String message);
	
	/**
	 * 发送消息
	 * @param msg 消息
	 */
	public void sendMsg(String msg) {
		this.message = msg;
		this.mediator.send(this);
	}
}
