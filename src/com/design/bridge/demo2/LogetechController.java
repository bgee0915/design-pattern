package com.design.bridge.demo2;

public class LogetechController extends TeleController{

	public LogetechController(TV tv) {
		super(tv);
	}

	@Override
	public void setChannel(int num) {
		System.out.println("logetechController change channel, num=" + num);
		tv.switchChannel(num);
	}
	
	
}
