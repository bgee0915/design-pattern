package com.design.memento.demo1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public CareTaker add(Memento memento) {
		mementoList.add(memento);
		System.out.println("save status -> " + memento.getStatus());
		return this;
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
