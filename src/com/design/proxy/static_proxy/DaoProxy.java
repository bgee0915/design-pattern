package com.design.proxy.static_proxy;

public class DaoProxy implements IDao{
	private IDao idao;
	
	public DaoProxy(IDao idao){
		this.idao = idao;
	}
	
	@Override
	public void save() {
		System.out.println("=== 某些操作开始 ===");
		idao.save();
		System.out.println("=== 某些操作结束 ===");
		
	}

}
