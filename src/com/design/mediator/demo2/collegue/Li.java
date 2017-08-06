package com.design.mediator.demo2.collegue;

import com.design.mediator.demo2.mediator.Mediator;

public class Li extends Collegue{

	public Li(Mediator mediator) {
		super(mediator);
	}


	@Override
	public void getMsg(String message) {
		System.out.println("li 接收到消息： " + message);
	}

	@Override
	public void sendMsg() {
		System.out.println("li 发送消息: " + getMessage());
	}

}
