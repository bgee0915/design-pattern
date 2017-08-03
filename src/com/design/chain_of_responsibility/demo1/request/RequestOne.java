package com.design.chain_of_responsibility.demo1.request;

import com.design.chain_of_responsibility.demo1.level.Level;

public class RequestOne extends AbstractRequest{

	public RequestOne(String content) {
		super(content);
	}

	@Override
	public int getLevel() {
		return Level.LEVEL_1;
	}

}
