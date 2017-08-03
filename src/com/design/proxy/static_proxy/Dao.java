package com.design.proxy.static_proxy;

public class Dao implements IDao{

	@Override
	public void save() {
		System.out.println("--- 保存数据 ---");
	}

}
