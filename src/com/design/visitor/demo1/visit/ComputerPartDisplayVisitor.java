package com.design.visitor.demo1.visit;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("visit keyboard");
	}
 
	@Override
	public void visit(Mouse mouse) {
		System.out.println("visit mouse");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("visit computer");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("visit monitor");
	}

}
