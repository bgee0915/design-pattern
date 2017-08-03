package com.design.bridge.demo2;

public class Test {
	public static void main(String[] args){
		TeleController lg = new LogetechController(new SumsungTV());
		lg.turnOn();
		lg.setChannel(1);
		lg.turnOff();
	}
}
