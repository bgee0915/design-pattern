package com.design.chain_of_responsibility.demo1.request;

import com.design.chain_of_responsibility.demo1.level.Level;

public class RequestThree extends AbstractRequest{

	public RequestThree(String content) {
		super(content);
	}

	@Override
	public int getLevel() {
		return Level.LEVEL_3;
	}

}
