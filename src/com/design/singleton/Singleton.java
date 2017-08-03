package com.design.singleton;

public class Singleton {
	private Singleton(){}
	private static Singleton singleton = null;
	public Singleton getSingleton(){
		if(null == singleton){
			synchronized(Singleton.class){
				if(null == singleton){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
