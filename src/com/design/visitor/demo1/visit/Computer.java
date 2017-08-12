package com.design.visitor.demo1.visit;

public class Computer implements ComputerPart{
	ComputerPart part[];
	
	public Computer() {
		part = new ComputerPart[] {new Keyboard(),new Monitor(), new Mouse()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(ComputerPart cp : part) {
			cp.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}
