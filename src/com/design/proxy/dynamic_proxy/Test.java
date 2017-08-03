package com.design.proxy.dynamic_proxy;

import com.design.proxy.static_proxy.Dao;
import com.design.proxy.static_proxy.IDao;

public class Test {
	public static void main(String[] args) {
		IDao idao = new Dao();
		System.out.println(idao.getClass());
		
		IDao proxy = (IDao) new ProxyFactory(idao).getProxyInstance();
		System.out.println(proxy.getClass());
		
		proxy.save();
	}
}
