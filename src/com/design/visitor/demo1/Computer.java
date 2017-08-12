package com.design.visitor.demo1;

public class Computer {
	ComputerPart part[];
	
	public Computer() {
		part = new ComputerPart[] {new Keyboard(),new Monitor(), new Mouse()};
	}
}
