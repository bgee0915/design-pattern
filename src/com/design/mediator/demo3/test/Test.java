package com.design.mediator.demo3.test;

import com.design.mediator.demo3.collegue.Catalina;
import com.design.mediator.demo3.collegue.Jam;
import com.design.mediator.demo3.collegue.Luna;
import com.design.mediator.demo3.collegue.User;
import com.design.mediator.demo3.meditor.ConcrateMediator;
import com.design.mediator.demo3.meditor.Mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new ConcrateMediator();
		
		User jam = new Jam("jam", mediator);
		User luna = new Luna("luna",mediator);
		User catalina = new Catalina("catalina",mediator);
		
		jam.sendMsg("你好");
		luna.sendMsg("我好");
		catalina.sendMsg("大家好");
		
	}
}
