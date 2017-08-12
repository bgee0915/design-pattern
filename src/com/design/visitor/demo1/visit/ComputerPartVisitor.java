package com.design.visitor.demo1.visit;

public interface ComputerPartVisitor {
	public void visit(Keyboard keyboard);
	public void visit(Mouse mouse);
	public void visit(Computer computer);
	public void visit(Monitor monitor);
}
