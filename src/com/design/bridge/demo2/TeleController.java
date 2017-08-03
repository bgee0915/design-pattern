package com.design.bridge.demo2;

public abstract class TeleController {
	protected TV tv;
	
	public TeleController(TV tv){
		this.tv = tv;
	}
	
	public void turnOn(){
		tv.on();
	}
	
	public void turnOff(){
		tv.off();
	}
	
	public abstract void setChannel(int num);
}
