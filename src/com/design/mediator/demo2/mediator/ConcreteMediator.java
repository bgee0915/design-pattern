package com.design.mediator.demo2.mediator;

import java.util.ArrayList;
import java.util.List;

import com.design.mediator.demo2.collegue.Collegue;

public class ConcreteMediator implements Mediator{
	List<Collegue> collegueList = new ArrayList<Collegue>();

	@Override
	public Mediator send(Collegue collegue) {
		
//		发送消息者发送消息。
		String msg = collegue.getMessage();
		for(Collegue collegues : collegueList) {
			if(collegues.equals(collegue)) {
				collegues.sendMsg();
				break;
			}
		}
		
//		不是发送消息者 接收消息
		for(Collegue collegues : collegueList) {
			if(collegues.equals(collegue)) {
				continue;
			}
			collegues.getMsg(msg);
		}
		
		return this;
	}

	@Override
	public Mediator add(Collegue collegue) {
		collegueList.add(collegue);
		return this;
	}

}
