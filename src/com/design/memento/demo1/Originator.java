package com.design.memento.demo1;

public class Originator {
	private String status;
	
	public Originator setStatus(String status) {
		this.status = status;
		System.out.println("Originator set status --> " + status);
		return this;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Memento saveStatusToMemento() {
		return new Memento(status);
	}
	
	public String getStatusFromMemenTo(Memento memento) {
		return memento.getStatus();
	}
	
}
