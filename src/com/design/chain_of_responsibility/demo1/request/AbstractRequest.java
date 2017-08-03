package com.design.chain_of_responsibility.demo1.request;

public abstract class AbstractRequest {
	private String content;
	public AbstractRequest(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public abstract int getLevel();
}
