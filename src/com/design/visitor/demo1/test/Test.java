package com.design.visitor.demo1.test;

import com.design.visitor.demo1.visit.Computer;
import com.design.visitor.demo1.visit.ComputerPartDisplayVisitor;
import com.design.visitor.demo1.visit.ComputerPartVisitor;

public class Test {
	public static void main(String[] args) {
		ComputerPartVisitor computerPart = new ComputerPartDisplayVisitor();
		new Computer().accept(computerPart);
	}
}



