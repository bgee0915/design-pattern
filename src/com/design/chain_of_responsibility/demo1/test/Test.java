package com.design.chain_of_responsibility.demo1.test;

import com.design.chain_of_responsibility.demo1.handle.AbstractHandler;
import com.design.chain_of_responsibility.demo1.handle.HandlerOne;
import com.design.chain_of_responsibility.demo1.handle.HandlerThree;
import com.design.chain_of_responsibility.demo1.handle.HandlerTwo;
import com.design.chain_of_responsibility.demo1.request.AbstractRequest;
import com.design.chain_of_responsibility.demo1.request.RequestOne;
import com.design.chain_of_responsibility.demo1.request.RequestThree;
import com.design.chain_of_responsibility.demo1.request.RequestTwo;

public class Test {
	public static void main(String[] args) {
		AbstractRequest requestOne = new RequestOne("请求 [001]");
		AbstractRequest requestTwo = new RequestTwo("请求 [002]");
		AbstractRequest requestThree = new RequestThree("请求 [003]");
		
		AbstractHandler handlerOne = new HandlerOne();
		AbstractHandler handlerTwo = new HandlerTwo();
		AbstractHandler handlerThree = new HandlerThree();
		
		handlerOne.nextHander(handlerTwo.nextHander(handlerThree));
		
		handlerOne
			.handlerRequest(requestOne)
			.handlerRequest(requestTwo)
			.handlerRequest(requestThree);
			;
		
	}
}
