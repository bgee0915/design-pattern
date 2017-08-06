package com.design.mediator.demo2.test;

import com.design.mediator.demo2.collegue.Collegue;
import com.design.mediator.demo2.collegue.Li;
import com.design.mediator.demo2.collegue.Wang;
import com.design.mediator.demo2.collegue.Yang;
import com.design.mediator.demo2.mediator.ConcreteMediator;
import com.design.mediator.demo2.mediator.Mediator;

public class Test {
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		
		Collegue li = new Li(mediator);
		Collegue wang = new Wang(mediator);
		Collegue yang = new Yang(mediator);
		
		mediator.add(li).add(wang).add(yang);
		
		li.sendMsg("泥猴啊 -- ");
		System.out.println(" ============== ");

		wang.sendMsg("大家猴啊 --- ");
		System.out.println(" ============== ");
		
		yang.sendMsg("一起猴啊 -----");
		System.out.println(" ============== ");
	}
}
