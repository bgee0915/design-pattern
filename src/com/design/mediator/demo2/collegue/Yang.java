package com.design.mediator.demo2.collegue;

import com.design.mediator.demo2.mediator.Mediator;

public class Yang extends Collegue{

	public Yang(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void getMsg(String message) {
		System.out.println("yang 接收到消息： " + message);
	}

	@Override
	public void sendMsg() {
		System.out.println("yang 发送消息: " + getMessage());
	}

}
