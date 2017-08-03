package com.design.command.demo1.invoker;

import java.util.ArrayList;
import java.util.List;

import com.design.command.demo1.command.Order;

public class Broker {
	private List<Order> orderList = new ArrayList<Order>();
	
	public Broker addOrder(Order order) {
		orderList.add(order);
		return  this;
	}
	
	public Broker execute() {
		if(null == orderList || orderList.size() < 1) {
			return null;
		}
		
		for(Order order : orderList) {
			order.execute();
		}
		orderList.clear();
		
		return this;
	}
}
