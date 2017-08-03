package com.design.bridge.demo2;

public class SumsungTV implements TV{

	@Override
	public void on() {
		System.out.println("samsung tv on. ");
	}

	@Override
	public void off() {
		System.out.println("samsung tv off. ");
	}

	@Override
	public void switchChannel(int num) {
		System.out.println("samsung tv change channel: " + num);
	}
	
}
