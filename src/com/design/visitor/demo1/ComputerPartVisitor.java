package com.design.visitor.demo1;

public interface ComputerPartVisitor {
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
	public void visit(Computer computer);
	public void visit(Monitor monitor);
}
