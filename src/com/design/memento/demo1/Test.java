package com.design.memento.demo1;

public class Test {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setStatus("status : 1").setStatus("status : 2");
		
		careTaker.add(originator.saveStatusToMemento());
		
		originator.setStatus("status : 3").setStatus("status : 4");
		
		careTaker.add(originator.saveStatusToMemento());
		
		originator.setStatus("status : 5");
		
		System.out.println("\n==========================================================\n");
		System.out.println("current status -->  " + originator.getStatus());
		System.out.println("the save[0] status --> " + originator.getStatusFromMemenTo(careTaker.get(0)));
		System.out.println("the save[1] status --> " + originator.getStatusFromMemenTo(careTaker.get(1)));
		
		
		
	}
}
