package com.design.chain_of_responsibility.demo1.handle;

import com.design.chain_of_responsibility.demo1.request.AbstractRequest;

public abstract class AbstractHandler {
	private AbstractHandler nextHandler = null;
	
	public final AbstractHandler handlerRequest(AbstractRequest request) {
		if(request.getLevel() == this.getLevel()) {
			this.handler(request);
		}else {
			if(null != nextHandler) {
				System.out.println("当前处理者:" + this.getLevel() + " 无法处理  " + request.getLevel() + "级别请求 - " + request.getContent() +"，移交给下一个级别， ");
				nextHandler.handler(request);
			}else {
				System.out.println("都无法处理！");
			}
		}
		return this;
	}
	
	public abstract int getLevel() ;
	
	public abstract void handler(AbstractRequest request);
	
	public AbstractHandler nextHander(AbstractHandler nextHandler) {
		this.nextHandler = nextHandler;
		return this;
	}
}
