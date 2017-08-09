package com.design.template.demo1.template;

public abstract class Game{
	abstract void initGame();
	
	abstract void start();
	
	abstract void end();
	
	public final void play() {
		initGame();
		
		start();
		
		end();
	}
}