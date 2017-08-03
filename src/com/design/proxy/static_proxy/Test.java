package com.design.proxy.static_proxy;

public class Test {
	public static void main(String[] args) {
		Dao dao = new Dao();
		DaoProxy proxyDao = new DaoProxy(dao);
		proxyDao.save();
	}
}
