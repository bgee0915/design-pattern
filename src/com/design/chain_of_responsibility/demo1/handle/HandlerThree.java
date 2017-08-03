package com.design.chain_of_responsibility.demo1.handle;

import com.design.chain_of_responsibility.demo1.level.Level;
import com.design.chain_of_responsibility.demo1.request.AbstractRequest;

public class HandlerThree extends AbstractHandler{

	@Override
	public int getLevel() {
		return Level.LEVEL_3;
	}

	@Override
	public void handler(AbstractRequest request) {
		System.out.println(request.getLevel() + " 处理请求： " + request.getContent());
	}

}
