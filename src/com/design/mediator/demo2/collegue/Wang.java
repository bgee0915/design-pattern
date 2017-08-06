package com.design.mediator.demo2.collegue;

import com.design.mediator.demo2.mediator.Mediator;

public class Wang extends Collegue{

	public Wang(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void getMsg(String message) {
		System.out.println("wang 接收到消息： " + message);
	}

	@Override
	public void sendMsg() {
		System.out.println("wang 发送消息: " + getMessage());
	}

}
